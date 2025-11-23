package org.example.meucompilador;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.meucompilador.parser.MeuCompiladorLexer;
import org.example.meucompilador.parser.MeuCompiladorParser;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TesteCompilador {

    private ParseTree parse(String codigoFonte) throws Exception {
        // Cria um input stream
        CharStream input = CharStreams.fromString(codigoFonte);

        // Cria o lexer e parser do ANTLR
        MeuCompiladorLexer lexer = new MeuCompiladorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MeuCompiladorParser parser = new MeuCompiladorParser(tokens);

        // Retorna a árvore sintática do programa
        return parser.programa();
    }

    @Test
    public void deveReconhecerDeclaracaoVariavel() throws Exception {
        String codigo = "inteiro x = 10;";
        ParseTree tree = parse(codigo);
        assertNotNull(tree);
    }

    @Test
    public void deveReconhecerCondicional() throws Exception {
        String codigo = ""
                + "inteiro x = 5;\n"
                + "se (x > 0) entao:\n"
                + "    escreva(\"positivo\");\n"
                + "fimse";
        ParseTree tree = parse(codigo);
        assertNotNull(tree);
    }

    @Test
    public void deveReconhecerPara() throws Exception {
        String codigo = "para i de 1 ate 5 faca: escreva(i); fimpara";
        ParseTree tree = parse(codigo);
        assertNotNull(tree);
    }

    @Test
    public void deveReconhecerLoopEnquanto() throws Exception {
        String codigo = ""
                + "enquanto (x < 10) faca:\n"
                + "x = x + 1;\n"
                + "fimenquanto";
        ParseTree tree = parse(codigo);
        assertNotNull(tree);
    }

    @Test
    public void deveSomarCorretamenteDoisNumerosInteiros() throws Exception {
        String codigo = ""
                + "inteiro x = 2;\n"
                + "inteiro y = 8;\n"
                + "inteiro total = x + y;";

        ParseTree tree = parse(codigo);
        assertNotNull(tree);

        Interpretador interpretador = new Interpretador();
        interpretador.visit(tree);
        Object total = interpretador.getVariavel("total");
        assertEquals(10, ((Number) total).intValue());
    }

    @Test
    public void deveSomarCorretamenteDoisNumerosReais() throws Exception {
        String codigo = ""
                + "inteiro x = 10.5;\n"
                + "inteiro y = 9.5;\n"
                + "inteiro total = x + y;";

        ParseTree tree = parse(codigo);
        assertNotNull(tree);

        Interpretador interpretador = new Interpretador();
        interpretador.visit(tree);
        Object total = interpretador.getVariavel("total");
        assertEquals(20, ((Number) total).floatValue());
    }


}

