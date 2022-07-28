import java.io.IOException;

import org.antlr.v4.runtime.*;

public class AnalisadorLexico {
    public static void main(String[] args){
        lerArquivo(args[0]);
    }
    private static void lerArquivo(String arquivo){
        try {
            CharStream entrada = CharStreams.fromFileName(arquivo);
            StelinhaLexer lexer = new StelinhaLexer(entrada);
            Token token;
            Integer errorCount = 0;

            System.out.println("Fluxo de Token");

            while (!lexer._hitEOF){
                token = lexer.nextToken();
                String lexama = token.getText();
                String classe = lexer.getVocabulary().getDisplayName(token.getType());
                System.out.print("<" + lexama + ", " + classe + "> ");
                if (classe == "ErrorChar"){
                    errorCount++;
                }
            }

            if (errorCount > 0){
                System.out.println("\n\n---------------------------------------------------------------------------------------");
                System.out.println("Foram encontrados caracteres que não pertencem a nenhum padrão conhecido da linguagem.");
                System.out.println("---------------------------------------------------------------------------------------");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
