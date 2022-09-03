import java.io.IOException;
import java.util.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class AnalisadorLexicoSintatico {
    public static void main(String[] args){
        lerArquivo(args[0]);
    }
    private static void lerArquivo(String arquivo){
        try {
            CharStream entrada = CharStreams.fromFileName(arquivo);
            StelinhaLexer lexer = new StelinhaLexer(entrada);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            StelinhaParser parser = new StelinhaParser(tokens);

            ParseTree ast = parser.inicio();
            
            System.out.println(ast.toStringTree());
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
