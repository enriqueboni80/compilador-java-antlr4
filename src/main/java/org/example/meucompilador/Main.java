package org.example.meucompilador;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
// Importe as classes geradas
import org.example.meucompilador.parser.MeuCompiladorLexer;
import org.example.meucompilador.parser.MeuCompiladorParser;


public class Main {
    public static void main(String[] args) throws Exception {
        String source =
                "inteiro idade = 25;\n" +
                        "real altura = 1.75;\n" +
                        "escreva(\"Iniciando checagem...\");\n" +

                        "se (idade > 18) entao:\n" +
                        "escreva(altura * 2);\n" +
                        "enquanto (idade < 30) faca:\n" +
                        "idade = idade + 1;\n" +
                        "fimenquanto\n" +
                        "senao:\n" + // Inclui o senao:
                        "escreva(\"Menor de idade\");\n" +
                        "fimse\n" + // Fecha o SE

                        "para i de 1 ate 10 faca:\n" +
                        "escreva(i);\n" +
                        "fimpara\n";

        // 1. Cria o Lexer
        MeuCompiladorLexer lexer = new MeuCompiladorLexer(CharStreams.fromString(source));

        // 2. Cria o Parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MeuCompiladorParser parser = new MeuCompiladorParser(tokens);

        // 3. Inicia a análise na regra 'program'
        ParseTree tree = parser.programa();

        // Imprime a árvore sintática (útil para verificar o resultado)
        System.out.println("Análise concluída com sucesso!");
        System.out.println(tree.toStringTree(parser));

        executar(source);

    }
    public static void executar(String codigoFonte) {

        CharStream input = CharStreams.fromString(codigoFonte);

        // 1. Lexer (Analisador Léxico)
        MeuCompiladorLexer lexer = new MeuCompiladorLexer(input);

        // Use o CustomErrorListener (assumindo que ele está em org.example)
        CustomErrorListener lexerErrorListener = new CustomErrorListener();
        lexer.removeErrorListeners();
        lexer.addErrorListener(lexerErrorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 2. Parser (Analisador Sintático)
        MeuCompiladorParser parser = new MeuCompiladorParser(tokens);
        CustomErrorListener parserErrorListener = new CustomErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(parserErrorListener);

        ParseTree tree = null;
        try {
            // Chamada correta para a regra principal: parser.programa()
            tree = parser.programa();
        } catch (Exception e) {
            // Ignora erros fatais no parsing para focar nos erros do Listener
        }

        // 3. Verificação e Execução
        if (lexerErrorListener.houveErros() || parserErrorListener.houveErros()) {
            System.out.println("=============================================");
            System.out.println("❌ FALHA NA COMPILAÇÃO: ERROS ENCONTRADOS! [cite: 23]");
            System.out.println("=============================================");

            lexerErrorListener.getErros().forEach(System.out::println);
            parserErrorListener.getErros().forEach(System.out::println);

        } else {
            // O compilador deve gerar a informação de que o código está correto. [cite: 24]
            System.out.println("=============================================");
            System.out.println("✅ COMPILAÇÃO BEM-SUCEDIDA! (Sintaxe OK)");
            System.out.println("=============================================");

            // 4. EXECUÇÃO (ANTLR VISITOR) - Onde a saída é gerada
            System.out.println("\n--- INICIANDO EXECUÇÃO (SAÍDA DE DADOS) ---");
            Interpretador interpretador = new Interpretador();
            interpretador.visit(tree); // Inicia a visita da árvore sintática
            System.out.println("--- EXECUÇÃO FINALIZADA ---");
        }
    }
}
