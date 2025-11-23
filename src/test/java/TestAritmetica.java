package org.example.meucompilador;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.example.meucompilador.BaseTestsUtils.parse;

public class TestAritmetica {

    @Test
    public void deveSomarCorretamenteDoisNumerosInteiros() throws Exception {
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

    @Test
    public void deveAplicarPrecedenciaMultiplicacaoAdicao() throws Exception {
        String codigo = ""
                + "inteiro resultado = 2 + 3 * 4;"; // Esperado: 2 + (3 * 4) = 14
        ParseTree tree = parse(codigo);
        Interpretador interpretador = new Interpretador();
        interpretador.visit(tree);
        Object resultado = interpretador.getVariavel("resultado");
        assertEquals(14, ((Number) resultado).intValue());
    }

    @Test
    public void deveAplicarPrecedenciaComParenteses() throws Exception {
        String codigo = ""
                + "inteiro resultado = (2 + 3) * 4;"; // Esperado: (2 + 3) * 4 = 20
        ParseTree tree = parse(codigo);
        Interpretador interpretador = new Interpretador();
        interpretador.visit(tree);
        Object resultado = interpretador.getVariavel("resultado");
        assertEquals(20, ((Number) resultado).intValue());
    }

    @Test
    public void deveAplicarPrecedenciaDivisaoSubtracaoEUnario() throws Exception {
        String codigo = ""
                + "inteiro a = 2;\n"
                + "inteiro b = 5;\n"
                + "inteiro resultado = 10 - (-a * b) / 5;";
        ParseTree tree = parse(codigo);
        Interpretador interpretador = new Interpretador();
        interpretador.visit(tree);
        Object resultado = interpretador.getVariavel("resultado");
        assertEquals(12, ((Number) resultado).intValue());
    }
}
