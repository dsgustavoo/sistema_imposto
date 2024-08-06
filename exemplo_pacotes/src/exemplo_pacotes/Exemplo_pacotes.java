package exemplo_pacotes;

import videos.Documentario;
import videos.Filme; //classe importada de outro pacote
import videos.Novela;

import gui.*;

/*PARA IMPORTAR TUDO DO PACOTE VIDEOS:
import videos.*; */

public class Exemplo_pacotes {

    public static void main(String[] args) {
        
        //precisa importar pois está em uma pasta diferente:
        Filme filme = new Filme();
        Novela novela = new Novela();
        Documentario documentario = new Documentario();
        
        Janela janelinha = new Janela();
        
    }
    
}
