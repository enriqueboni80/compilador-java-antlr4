package org.example.meucompilador;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import java.util.ArrayList;
import java.util.List;


public class CustomErrorListener extends BaseErrorListener {

    private final List<String> erros = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        String tipoErro = (recognizer instanceof org.antlr.v4.runtime.Lexer) ? "Léxico" : "Sintático";

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

    public boolean houveErros() {
        return !erros.isEmpty();
    }

    public List<String> getErros() {
        return erros;
    }

    private String getOffendingText(Object offendingSymbol) {
        if (offendingSymbol instanceof Token) {
            return ((Token) offendingSymbol).getText();
        }
        return "N/A";
    }
}
