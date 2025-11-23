package org.example.meucompilador;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.example.meucompilador.BaseTestsUtils.parse;

public class TestLoops {

    @Test
    public void deveReconhecerLoopPara() throws Exception {
        // Responsabilidade: Verificar a sintaxe do loop 'para'.
        String codigo = "para i de 1 ate 5 faca: escreva(i); fimpara";
        ParseTree tree = parse(codigo);
        assertNotNull(tree);
    }

    @Test
    public void deveReconhecerLoopEnquanto() throws Exception {
        // Responsabilidade: Verificar a sintaxe do loop 'enquanto'.
        String codigo = ""
                + "inteiro x = 0;\n"
                + "enquanto (x < 10) faca:\n"
                + "x = x + 1;\n"
                + "fimenquanto";
        ParseTree tree = parse(codigo);
        assertNotNull(tree);
    }
}
