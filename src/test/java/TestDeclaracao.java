package org.example.meucompilador;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.example.meucompilador.BaseTestsUtils.parse;

public class TestDeclaracao {

    @Test
    public void deveReconhecerDeclaracaoVariavel() throws Exception {
        String codigo = "inteiro x = 10;";
        ParseTree tree = parse(codigo);
        assertNotNull(tree);
    }
}