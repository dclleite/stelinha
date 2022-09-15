import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class AnalisadorSematico {
     public static void main(String[] args){
        StelinhaParser parser = getParser(args[0]);

        //obter arvore
        ParseTree ast = parser.inicio();

        // MyListener listener = new MyListener();
        MyListener listener = new MyListener();


        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, ast);

    }
    private static StelinhaParser getParser(String arquivo){
        StelinhaParser parser = null;
        try {
            CharStream entrada = CharStreams.fromFileName(arquivo);

            StelinhaLexer lexer = new StelinhaLexer(entrada);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new StelinhaParser(tokens);

            // ParseTree ast = parser.inicio();

            // System.out.println(ast.toStringTree());
        }
        catch(IOException e){
            e.printStackTrace();
        }

        return parser;
    }
}
