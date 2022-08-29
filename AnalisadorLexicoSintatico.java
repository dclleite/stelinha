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
            Token token;
            List<String[]> erros = new ArrayList<String[]>();

            System.out.println("Fluxo de Token");

            while ((token = lexer.nextToken()).getType() != Token.EOF){
                String lexama = token.getText();
                String classe = StelinhaLexer.VOCABULARY.getDisplayName(token.getType());
                System.out.print("<" + lexama + ", " + classe + "> \n");
                if (classe == "ErrorChar"){
                    String[] errorData = { Integer.toString(token.getLine()), lexama };
                    erros.add(errorData);
                }
            }

            if (erros.size() > 0){
                System.out.println("\n\n---------------------------------------------------------------------------------------");
                System.out.printf("Foram encontrados %d caracteres que não pertencem a nenhum padrão conhecido da linguagem.\n", erros.size());
                System.out.println("Linhas com erro: ");
                for(String[] errorData : erros) {
                    System.out.printf("linha: %s - caractere: %s\n", errorData[0], errorData[1]);
                }
                System.out.println("---------------------------------------------------------------------------------------");
            } else {
                CommonTokenStream tokenStream = new CommonTokenStream(new StelinhaLexer(entrada));
                StelinhaParser parser = new StelinhaParser(tokenStream);
                ParseTree ast = parser.inicio();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
