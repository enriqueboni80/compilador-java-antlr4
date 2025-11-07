package org.example.meucompilador;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe CustomErrorListener: Estende BaseErrorListener do ANTLR e captura
 * todos os erros léxicos e sintáticos para exibição ao usuário.
 */
public class CustomErrorListener extends BaseErrorListener {

    private final List<String> erros = new ArrayList<>();

    // ----------------------------------------------------------------------
    // 1. Método para Capturar Erros (Override do ANTLR)
    // ----------------------------------------------------------------------
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        String tipoErro = (recognizer instanceof org.antlr.v4.runtime.Lexer) ? "Léxico" : "Sintático";

        // Formata a mensagem do erro
        String erroFormatado = String.format(
                "[%s] Linha %d:%d: %s (Símbolo Ofensor: %s)",
                tipoErro,
                line,
                charPositionInLine,
                msg,
                getOffendingText(offendingSymbol)
        );

        erros.add(erroFormatado);
    }

    // ----------------------------------------------------------------------
    // 2. Métodos de Acesso
    // ----------------------------------------------------------------------

    /** Retorna true se algum erro foi capturado. */
    public boolean houveErros() {
        return !erros.isEmpty();
    }

    /** Retorna a lista de mensagens de erro formatadas. */
    public List<String> getErros() {
        return erros;
    }

    /**
     * Auxiliar para extrair o texto do símbolo ofensor (token).
     */
    private String getOffendingText(Object offendingSymbol) {
        if (offendingSymbol instanceof Token) {
            return ((Token) offendingSymbol).getText();
        }
        return "N/A";
    }
}
