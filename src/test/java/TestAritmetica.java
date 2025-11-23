package org.example.meucompilador;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.example.meucompilador.BaseTestsUtils.parse;

public class TestAritmetica {

    @Test
    public void deveSomarCorretamenteDoisNumerosInteiros() throws Exception {
        // Responsabilidade: Interpretar a soma de inteiros.
        String codigo = ""
                + "inteiro x = 2;\n"
                + "inteiro y = 8;\n"
                + "inteiro total = x + y;";

        ParseTree tree = parse(codigo);
        Interpretador interpretador = new Interpretador();
        interpretador.visit(tree);
        Object total = interpretador.getVariavel("total");
        assertEquals(10, ((Number) total).intValue());
    }

    @Test
    public void deveSomarCorretamenteDoisNumerosReais() throws Exception {
        // Responsabilidade: Interpretar a soma de números de ponto flutuante.
        // OBS: Ajustei o tipo no código de teste de 'inteiro' para 'real' (assumindo que 'real' é o tipo flutuante do seu compilador).
        String codigo = ""
                + "real x = 10.5;\n"
                + "real y = 9.5;\n"
                + "real total = x + y;";

        ParseTree tree = parse(codigo);
        Interpretador interpretador = new Interpretador();
        interpretador.visit(tree);
        Object total = interpretador.getVariavel("total");
        assertEquals(20.0, ((Number) total).floatValue(), 0.001);
    }
}
