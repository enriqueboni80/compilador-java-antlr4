package org.example.meucompilador;

import org.example.meucompilador.parser.MeuCompiladorBaseVisitor;
import org.example.meucompilador.parser.MeuCompiladorParser;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// O Visitor retorna Object, pois os valores podem ser Integer, Float ou String
public class Interpretador extends MeuCompiladorBaseVisitor<Object> {

    // Tabela de Símbolos Simples (Escopo Global) para armazenar variáveis
    private final Map<String, Object> memoria = new HashMap<>();

    // Usado para o comando 'leia'
    private final Scanner scanner = new Scanner(System.in);

    public Object getVariavel(String nome) {
        return memoria.get(nome);
    }

    // ----------------------------------------------------------------------------------
    // 1. Variáveis e Atribuição (Inclui Verificações Diferenciais)
    // ----------------------------------------------------------------------------------

    @Override
    public Object visitDeclaracao_var(MeuCompiladorParser.Declaracao_varContext ctx) {
        String id = ctx.ID().getText();

        if (memoria.containsKey(id)) {
            // Diferencial: Checa re-declaração
            System.err.println("ERRO SEMÂNTICO: Variável '" + id + "' já declarada.");
            return null;
        }

        Object valor = null;

        // Verifica se há atribuição na declaração (ex: inteiro x = 10)
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
            // Diferencial: Checa uso de variável não declarada
            System.err.println("ERRO SEMÂNTICO: Variável '" + id + "' não declarada. Atribuição ignorada.");
            return null;
        }

        Object valor = visit(ctx.expressao());
        memoria.put(id, valor);
        return valor;
    }

    // ----------------------------------------------------------------------------------
    // 2. Comandos de I/O (Saída/Resultado)
    // ----------------------------------------------------------------------------------

    @Override
    public Object visitEscreva_stmt(MeuCompiladorParser.Escreva_stmtContext ctx) {
        Object valor = visit(ctx.expressao());

        // GERAÇÃO DA SAÍDA: Imprime o resultado no console
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

        // Simplesmente lê o input como String e armazena.
        // A lógica de tipos seria complexa para um exemplo rápido.
        System.out.print("'" + id + "': ");
        String input = scanner.nextLine();

        try {
            // Tenta converter para Integer/Float para manter a consistência com 'visitAtomo'
            if (input.contains(".")) {
                memoria.put(id, Float.parseFloat(input));
            } else {
                memoria.put(id, Integer.parseInt(input));
            }
        } catch (NumberFormatException e) {
            // Caso não seja número, armazena como texto
            memoria.put(id, input);
        }

        return null;
    }

    // ----------------------------------------------------------------------------------
    // 3. Expressões e Operações Matemáticas
    // ----------------------------------------------------------------------------------

    @Override
    public Object visitExpressao(MeuCompiladorParser.ExpressaoContext ctx) {

        if (ctx.atomo() != null) {
            return visit(ctx.atomo());
        }

        // Operações binárias (+, -, *, /)
        if (ctx.expressao().size() == 2) {
            Object esquerdaObj = visit(ctx.expressao(0));
            Object direitaObj = visit(ctx.expressao(1));
            String op = ctx.getChild(1).getText();

            // Lógica para Strings (Concatenação)
            if (op.equals("+") && (esquerdaObj instanceof String || direitaObj instanceof String)) {
                return esquerdaObj.toString() + direitaObj.toString();
            }

            // Lógica para Números (Converte para Float para suportar inteiros e reais)
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

            // Tratamento de erro básico se a operação for inválida (ex: 5 * "texto")
            System.err.println("ERRO SEMÂNTICO: Operação inválida entre tipos de dados.");
            return 0;
        }

        // Caso Unário (ex: -5)
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
        // Caso de parênteses: (expressao)
        if (ctx.expressao() != null) {
            return visit(ctx.expressao());
        }
        return null;
    }

    // ----------------------------------------------------------------------------------
    // 4. Estruturas de Fluxo (APENAS TRAVESSIA - LÓGICA DEVE SER ADICIONADA SE NECESSÁRIO)
    // ----------------------------------------------------------------------------------

    // Regra principal: Inicia a travessia por todo o programa
    @Override
    public Object visitPrograma(MeuCompiladorParser.ProgramaContext ctx) {
        // Isso garante que ele percorra todos os comandos sequencialmente
        return super.visitPrograma(ctx);
    }

    // Se você precisar da execução do IF e WHILE, terá que implementar visitSe_senao_stmt
    // e visitEnquanto_stmt, que exigem a lógica de visitExpressao_booleana.
    // Por enquanto, o foco está na saída de dados e atribuições.

    // ----------------------------------------------------------------------------------

    // 5. Estrutura de Repetição 'PARA' (Nova Implementação)
    // ----------------------------------------------------------------------------------

    @Override
    public Object visitPara_stmt(MeuCompiladorParser.Para_stmtContext ctx) {
        String id = ctx.ID().getText();

        // 1. Inicialização: Obtém o valor inicial (expressao 0)
        Object inicioObj = visit(ctx.expressao(0));
        Object fimObj = visit(ctx.expressao(1));

        // Assume-se que 'inicio' e 'fim' são inteiros/reais
        if (!(inicioObj instanceof Number && fimObj instanceof Number)) {
            System.err.println("ERRO SEMÂNTICO: Condições 'de' e 'ate' do 'para' devem ser numéricas.");
            return null;
        }

        int inicio = ((Number) inicioObj).intValue();
        int fim = ((Number) fimObj).intValue();
        int passo = 1; // Passo padrão

        // Verifica se há a cláusula 'passo'
        if (ctx.expressao().size() > 2) {
            Object passoObj = visit(ctx.expressao(2));
            if (passoObj instanceof Number) {
                passo = ((Number) passoObj).intValue();
            }
        }

        // Adiciona ou sobrescreve a variável de controle no escopo
        memoria.put(id, inicio);

        // 2. Execução do Loop
        for (int i = inicio; i <= fim; i += passo) {
            // Atualiza a variável de controle no mapa antes de executar o bloco
            memoria.put(id, i);

            // Executa o bloco de comandos
            visit(ctx.bloco());
        }

        // Após o loop, o valor final do ID pode ser mantido ou removido, dependendo da semântica.
        // Para simplificar, vamos manter o último valor (fim).

        return null;
    }
}
