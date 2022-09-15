import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import static java.util.Objects.isNull;


public class MyListener extends StelinhaBaseListener{

    private Map<String, String> tabelaSimbolos = new HashMap<String, String>();

    @Override
    public void enterNDeclaracao(StelinhaParser.NDeclaracaoContext ctx){
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();

        if (tabelaSimbolos.containsKey(id)){
        System.out.println("-------------------------------------");

        System.out.println("Declaração duplicada! Variavel " + id + "já foi declarada.");
        System.out.println("-------------------------------------");


        }
        else{
            tabelaSimbolos.put(id, tipo);
        }
    }

    @Override
    public void enterNAtribuicao(StelinhaParser.NAtribuicaoContext ctx){
        String id = ctx.ID().getText();

        System.out.println("a "+ id + " " + tabelaSimbolos.get(id));
		// System.out.println("a "+ id + " " + ctx.termo().getText());
		// System.out.println("a "+ id + " " + ctx.termo());

        if (!tabelaSimbolos.containsKey(id)){
            System.out.println("Variavel " + id + " não foi declarada!");
        }

        else if (!isNull(ctx.termo())){
		    // System.out.println("a "+ id + " " + ctx.termo().getText());
            if (!isNull(ctx.termo().ID())){
                if (!tabelaSimbolos.containsKey(ctx.termo().ID().getText())){
                    System.out.println("Variavel " + ctx.termo().ID().getText() + " não foi declarada!");
                }
                else if (tabelaSimbolos.get(id) == tabelaSimbolos.get(ctx.termo().ID().getText())){
                    System.out.println("Tipos incompativeis");
                }
            }
            // else{
            //         System.out.println(ctx.termo().NUM().getText());

            //     if (tabelaSimbolos.get(id) == "INTEIRO" && !ctx.termo().NUM().getText()){
            //         System.out.println("Tipos incompativeis com NUM");
            //     }
            // }

        }



    }
}