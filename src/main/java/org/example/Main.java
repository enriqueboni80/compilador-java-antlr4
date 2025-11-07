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
    }
}
