package generate_code;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ThrowError extends BaseErrorListener {
    public static final ThrowError INSTANCE = new ThrowError();


    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        try {
            throw new Exception("line " + line + ":" + charPositionInLine + " " + msg );
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
