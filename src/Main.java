import ast.classes.StartCompiler;
import ast.visitor.BaseVisitor;
import filesCode.FileServices;
import generate_code.ThrowError;
import generate_code.generate_model.GenerateModel;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import generate.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) throws Exception {
//        CodeGenerate.getInstance().addToListOFQueue("213213" , 4);
//        CodeGenerate.getInstance().addToListOFQueue("213213" , 2);

//        CheckSyntax.getInstance();

        String source = "samples//samples.txt";
        CharStream cs = fromFileName(source);
        MyLexer lexer = new MyLexer(cs);
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowError.INSTANCE);
        CommonTokenStream token = new CommonTokenStream(lexer);
        MyParser parser = new MyParser(token);
        parser.removeErrorListeners();;
        parser.addErrorListener(ThrowError.INSTANCE);
        ParseTree tree = parser.startCompielr();
        StartCompiler doc = (StartCompiler) new BaseVisitor().visit(tree);
        System.out.println(doc);


        (new FileServices()).SaveResult();
    }
}


/*
lexer.removeErrorListeners()  بيمسح قائمة الأخطاء

 */
/*
- controller
ما عم يجيبها ع ast ويعمللها check
- check id input
- check screen move
 */