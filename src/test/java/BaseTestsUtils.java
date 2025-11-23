package org.example.meucompilador;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.meucompilador.parser.MeuCompiladorLexer;
import org.example.meucompilador.parser.MeuCompiladorParser;

public class BaseTestsUtils {

    public static ParseTree parse(String codigoFonte) throws Exception {
        CharStream input = CharStreams.fromString(codigoFonte);
        MeuCompiladorLexer lexer = new MeuCompiladorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MeuCompiladorParser parser = new MeuCompiladorParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ThrowingErrorListener());
        return parser.programa();
    }

    private static class ThrowingErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            throw new RuntimeException("Erro de Sintaxe: " + msg);
        }
    }
}
