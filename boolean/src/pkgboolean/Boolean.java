package pkgboolean;

public class Boolean {

    public static void main(String[] args) {
        
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamos_a_praia = fimDeSemana && fazendoSol;
        
        //TABELA VERDADE:
        // operador && (AND) > todas as condições precisam ser true
        // operador || (OR) > apenas uma condição precisa ser true
        
        System.out.println(vamos_a_praia);
        
        //Operador ternário:
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
    
}
