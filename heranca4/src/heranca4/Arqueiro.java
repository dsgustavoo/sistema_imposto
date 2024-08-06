package heranca4;

import heranca4.e.personagem;

public class Arqueiro extends personagem {
    private String arma;
    
    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        setNivel(2);
        this.arma = "Arco longo";
    }

    @Override
    public String toString() {
       String informacoesPersonagem = super.toString();
       String informacaoArqueiro = String.format(" - Arma: %s", arma);
       return informacoesPersonagem + informacaoArqueiro;
    }

    @Override
    public void atacar() {
        System.out.println("O arqueiro atacou com " + arma);
    }
    
    
    
}
