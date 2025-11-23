package org.example.meucompilador;

import org.example.meucompilador.parser.MeuCompiladorBaseVisitor;
import org.example.meucompilador.parser.MeuCompiladorParser;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Interpretador extends MeuCompiladorBaseVisitor<Object> {

    private final Map<String, Object> memoria = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);

    public Object getVariavel(String nome) {
        return memoria.get(nome);
    }

    @Override
    public Object visitDeclaracao_var(MeuCompiladorParser.Declaracao_varContext ctx) {
        String id = ctx.ID().getText();

        if (memoria.containsKey(id)) {
            System.err.println("ERRO SEMÂNTICO: Variável '" + id + "' já declarada.");
            return null;
        }
        Object valor = null;
        if (ctx.expressao() != null) {
            valor = visit(ctx.expressao());
        }
        memoria.put(id, valor);
        return valor;
    }

    @Override
    public Object visitAtribuicao(MeuCompiladorParser.AtribuicaoContext ctx) {
        String id = ctx.ID().getText();
        if (!memoria.containsKey(id)) {
            System.err.println("ERRO SEMÂNTICO: Variável '" + id + "' não declarada. Atribuição ignorada.");
            return null;
        }
        Object valor = visit(ctx.expressao());
        memoria.put(id, valor);
        return valor;
    }

    @Override
    public Object visitEscreva_stmt(MeuCompiladorParser.Escreva_stmtContext ctx) {
        Object valor = visit(ctx.expressao());
        System.out.println(valor);
        return null;
    }

    @Override
    public Object visitLeia_stmt(MeuCompiladorParser.Leia_stmtContext ctx) {
        String id = ctx.ID().getText();
        if (!memoria.containsKey(id)) {
            System.err.println("ERRO SEMÂNTICO: Variável '" + id + "' não declarada. Leitura ignorada.");
            return null;
        }
        System.out.print("'" + id + "': ");
        String input = scanner.nextLine();

        try {
            if (input.contains(".")) {
                memoria.put(id, Float.parseFloat(input));
            } else {
                memoria.put(id, Integer.parseInt(input));
            }
        } catch (NumberFormatException e) {
            memoria.put(id, input);
        }

        return null;
    }

    @Override
    public Object visitExpressao(MeuCompiladorParser.ExpressaoContext ctx) {
        if (ctx.atomo() != null) {
            return visit(ctx.atomo());
        }
        if (ctx.expressao().size() == 2) {
            Object esquerdaObj = visit(ctx.expressao(0));
            Object direitaObj = visit(ctx.expressao(1));
            String op = ctx.getChild(1).getText();
            if (op.equals("+") && (esquerdaObj instanceof String || direitaObj instanceof String)) {
                return esquerdaObj.toString() + direitaObj.toString();
            }
            if (esquerdaObj instanceof Number && direitaObj instanceof Number) {
                float esq = ((Number) esquerdaObj).floatValue();
                float dir = ((Number) direitaObj).floatValue();
                switch (op) {
                    case "+": return esq + dir;
                    case "-": return esq - dir;
                    case "*": return esq * dir;
                    case "/":
                        if (dir == 0) {
                            System.err.println("ERRO DE EXECUÇÃO: Divisão por zero.");
                            return 0.0f;
                        }
                        return esq / dir;
                }
            }
            System.err.println("ERRO SEMÂNTICO: Operação inválida entre tipos de dados.");
            return 0;
        }
        if (ctx.getChildCount() == 2 && ctx.getChild(0).getText().equals("-")) {
            Object valor = visit(ctx.expressao(0));
            if (valor instanceof Number) {
                return -((Number) valor).floatValue();
            }
        }
        return 0;
    }

    @Override
    public Object visitAtomo(MeuCompiladorParser.AtomoContext ctx) {
        if (ctx.NUMERO_INTEIRO() != null) {
            return Integer.parseInt(ctx.NUMERO_INTEIRO().getText());
        }
        if (ctx.NUMERO_REAL() != null) {
            return Float.parseFloat(ctx.NUMERO_REAL().getText());
        }
        if (ctx.VALOR_TEXTO() != null) {
            // Remove as aspas do literal de texto ("Olá mundo") -> Olá mundo
            String texto = ctx.VALOR_TEXTO().getText();
            return texto.substring(1, texto.length() - 1);
        }
        if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            if (memoria.containsKey(id)) {
                // Retorna o valor armazenado
                return memoria.get(id);
            } else {
                System.err.println("ERRO SEMÂNTICO: Variável '" + id + "' não declarada/inicializada.");
                return 0;
            }
        }
        if (ctx.expressao() != null) {
            return visit(ctx.expressao());
        }
        return null;
    }

    @Override
    public Object visitPrograma(MeuCompiladorParser.ProgramaContext ctx) {
        // Isso garante que ele percorra todos os comandos sequencialmente
        return super.visitPrograma(ctx);
    }

    @Override
    public Object visitPara_stmt(MeuCompiladorParser.Para_stmtContext ctx) {
        String id = ctx.ID().getText();
        Object inicioObj = visit(ctx.expressao(0));
        Object fimObj = visit(ctx.expressao(1));
        if (!(inicioObj instanceof Number && fimObj instanceof Number)) {
            System.err.println("ERRO SEMÂNTICO: Condições 'de' e 'ate' do 'para' devem ser numéricas.");
            return null;
        }
        int inicio = ((Number) inicioObj).intValue();
        int fim = ((Number) fimObj).intValue();
        int passo = 1; // Passo padrão
        if (ctx.expressao().size() > 2) {
            Object passoObj = visit(ctx.expressao(2));
            if (passoObj instanceof Number) {
                passo = ((Number) passoObj).intValue();
            }
        }
        memoria.put(id, inicio);
        for (int i = inicio; i <= fim; i += passo) {
            memoria.put(id, i);
            visit(ctx.bloco());
        }
        return null;
    }
}
