package heranca4;

import heranca4.e.personagem;

public class Main {

    public static void main(String[] args) {
        /*Serie serieQualquer = new Serie("The last of us", 1, 2023);
        
        System.out.println(serieQualquer); //chama o método toString();
        */
        
        
        personagem personagem = new personagem("Gustavo");
        System.out.println(personagem);
        personagem.atacar();
        
        Arqueiro arqueiro = new Arqueiro("Legolas");
        System.out.println(arqueiro);
        arqueiro.atacar();
    }
    
}
