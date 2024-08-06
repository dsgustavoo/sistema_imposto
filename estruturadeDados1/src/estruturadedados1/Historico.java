package estruturadedados1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Historico {
    Queue<Site> sites;
    
    public Historico (){
        sites = new LinkedList<Site>();
    }
    
    public void executa(){
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";
        
        while (continuar.equals("s")){
            Site novoSite = new Site();
            novoSite.nome = entrada.nextLine();
            novoSite.url = entrada.nextLine();
            
            sites.add (novoSite);
            
            if (sites.size() > 3) {
                Site removido = sites.remove();
                System.out.println("Site removido: " + removido.url);
            }
            
            System.out.println("Continuar (s/n)");
            continuar = entrada.nextLine();
        }
    }
}
