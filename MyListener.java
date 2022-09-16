import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;
public class MyListener extends StelinhaBaseListener{

    private Map<String, String> tabelaSimbolos = new HashMap<String, String>();

    @Override
    public void enterNDeclaracao(StelinhaParser.NDeclaracaoContext ctx){
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();
        // Variavel declarada mais de uma vez
        if (tabelaSimbolos.containsKey(id)){
            System.out.println("Declaração duplicada! Variavel " + id + "já foi declarada.");
        }
        else{
            tabelaSimbolos.put(id, tipo);
        }
    }

    @Override
    public void enterNAtribuicao(StelinhaParser.NAtribuicaoContext ctx){
        String id = ctx.ID().getText();

        // Variavel que receberá o valor não foi declarada
        if (!tabelaSimbolos.containsKey(id)){
            System.out.println("Variavel " + id + " não foi declarada!");
        }
        else if (!isNull(ctx.termo())){
            if (!isNull(ctx.termo().ID())){
                String valor = ctx.termo().ID().getText();
                // Variavel que será usada para atribuir valor a outra não foi declarada
                if (!tabelaSimbolos.containsKey(valor)){
                    System.out.println("Variavel " + valor + " não foi declarada!");
                }
                // Os tipos das variaveis não são compativeis
                else if (!tabelaSimbolos.get(id).equalsIgnoreCase(tabelaSimbolos.get(valor))){
                    System.out.println("Tipos incompativeis2 " + tabelaSimbolos.get(id) + " e " + tabelaSimbolos.get(valor));
                    System.out.println(tabelaSimbolos.get(id).equalsIgnoreCase(tabelaSimbolos.get(valor)));
                }
            }
            // Atribuiu um valor que não era número
            else if ((tabelaSimbolos.get(id).equalsIgnoreCase("INTEIRO")) || (tabelaSimbolos.get(id).equalsIgnoreCase("FLUTUANTE"))){
                if (!isNull(ctx.termo().MENTIRA()) || !isNull(ctx.termo().VERDADE())){
                    System.out.println("Tipos incompativeis2 " + tabelaSimbolos.get(id) + " e " + "BOOLEANO");
                }
                else if (!isNull(ctx.termo().CARAC())){
                    System.out.println("Tipos incompativeis2 " + tabelaSimbolos.get(id) + " e " + "CARACTER");
                }

            }
            // Atribuiu um valor que não era uma seuqencia de caractere
            else if (tabelaSimbolos.get(id).equalsIgnoreCase("CARACTER")){
                if (!isNull(ctx.termo().MENTIRA()) || !isNull(ctx.termo().VERDADE())){
                    System.out.println("Tipos incompativeis2 " + tabelaSimbolos.get(id) + " e " + "BOOLEANO");
                }
                else if (!isNull(ctx.termo().NUM())){
                    System.out.println("Tipos incompativeis2 " + tabelaSimbolos.get(id) + " e " + "INTEIRO");
                }

            }
            // Atribuiu um valor que não era VERDADE ou MENTIRA
            else if (tabelaSimbolos.get(id).equalsIgnoreCase("BOOLEANO")){
                if (!isNull(ctx.termo().NUM())){
                    System.out.println("Tipos incompativeis2 " + tabelaSimbolos.get(id) + " e " + "INTEIRO");
                }
                else if (!isNull(ctx.termo().CARAC())){
                    System.out.println("Tipos incompativeis2 " + tabelaSimbolos.get(id) + " e " + "CARACTER");
                }

            }

        }
    }
}