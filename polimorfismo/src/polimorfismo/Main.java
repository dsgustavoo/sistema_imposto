package polimorfismo;

public class Main {

    public static void main(String[] args) {
        
        //polimorfismo: um unico nome pode ter comportamentos diferentes
        Filme filme = new Filme("Lagoa azul");
        filme.play();
        filme.play("japonês");
        filme.play("inglês", "portugues");
        
        
        Serie serie = new Serie(2, 10, "The last of us");
        serie.play(1, 8);
        System.out.println(serie);
    }
    
}
