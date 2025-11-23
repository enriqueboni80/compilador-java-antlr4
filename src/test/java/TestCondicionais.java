package org.example.meucompilador;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.example.meucompilador.BaseTestsUtils.parse;

public class TestCondicionais {

    @Test
    public void deveReconhecerCondicional() throws Exception {
        // Responsabilidade: Verificar a sintaxe da condicional 'se'.
        String codigo = ""
                + "inteiro x = 5;\n"
                + "se (x > 0) entao:\n"
                + "    escreva(\"positivo\");\n"
                + "fimse";
        ParseTree tree = parse(codigo);
        assertNotNull(tree);
    }
}
