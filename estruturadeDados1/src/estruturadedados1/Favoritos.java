package estruturadedados1;

import java.util.ArrayList;
import java.util.List;

public class Favoritos {
    List<Site> sites;
    
    public Favoritos(){
        sites = new ArrayList<Site>();
    }
    
    public void mostraFavoritos(){
        System.out.println("Lista de favoritos:");
        for(Site s : sites) {
            System.out.println(s.nome + " (" + s.url + ")");
        }
    }
    
    public void executa(){
        sites.add(new Site("Site1", "www.1.com"));
        sites.add(new Site("Site2", "www.2.com"));
        sites.add(new Site("Site3", "www.3.com"));
        mostraFavoritos();
    }
}
