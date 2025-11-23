package org.example.meucompilador;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.meucompilador.parser.MeuCompiladorLexer;
import org.example.meucompilador.parser.MeuCompiladorParser;


public class Main {
    public static void main(String[] args) throws Exception {
        String source =
                "inteiro idade = 25;\n"
                        + "real altura = 1.75;\n"
                        + "escreva(altura);\n"
                        + "escreva(\"Iniciando checagem...\");\n"
                        + "se (idade > 18) entao:\n"
                        + "escreva(altura * 2);\n"
                        + "enquanto (idade < 30) faca:\n"
                        + "idade = idade + 1;\n"
                        + "fimenquanto\n"
                        + "senao:\n"
                        + "escreva(\"Menor de idade\");\n"
                        + "fimse\n"
                        + "para i de 1 ate 10 faca:\n"
                        + "escreva(i);\n"
                        + "fimpara\n";

        // 1. CRIA LEXER
        MeuCompiladorLexer lexer = new MeuCompiladorLexer(CharStreams.fromString(source));
        // 2. FAZ PARSER
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MeuCompiladorParser parser = new MeuCompiladorParser(tokens);
        // 3. IMPRIME ÁRVORE SINTATICA
        ParseTree tree = parser.programa();
        System.out.println("Análise concluida com sucesso!");
        System.out.println(tree.toStringTree(parser));
        // 4. EXECUTA CÓDIGO FONTE / TOKENS
        executar(source);
    }
    public static void executar(String codigoFonte) {

        CharStream input = CharStreams.fromString(codigoFonte);
        // 1. ANALISADOR LÉXICO
        MeuCompiladorLexer lexer = new MeuCompiladorLexer(input);
        CustomErrorListener lexerErrorListener = new CustomErrorListener();
        lexer.removeErrorListeners();
        lexer.addErrorListener(lexerErrorListener);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // 2. ANALISADOR SINTÁTICO
        MeuCompiladorParser parser = new MeuCompiladorParser(tokens);
        CustomErrorListener parserErrorListener = new CustomErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(parserErrorListener);
        ParseTree tree = null;
        try {
            tree = parser.programa();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // 3. RETORNO DA VERIFICAÇÃO E EXECUÇÃO
        if (lexerErrorListener.houveErros() || parserErrorListener.houveErros()) {
            System.out.println("❌ FALHA NA COMPILAÇÃO: ERROS ENCONTRADOS!");
            lexerErrorListener.getErros().forEach(System.out::println);
            parserErrorListener.getErros().forEach(System.out::println);
        } else {
            System.out.println("✅ COMPILAÇÃO BEM-SUCEDIDA! (Sintaxe OK)");
            // 4. EXECUÇÃO (ANTLR VISITOR) | SAÍDA DE DADOS
            System.out.println("\n--- INICIANDO EXECUÇÃO (SAÍDA DE DADOS) ---");
            Interpretador interpretador = new Interpretador();
            interpretador.visit(tree);
            System.out.println("--- EXECUÇÃO FINALIZADA ---");
        }
    }
}
