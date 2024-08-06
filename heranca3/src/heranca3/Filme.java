package heranca3;

public class Filme extends Video {
    public String genero, produtora;

    public Filme(String genero, String produtora, String titulo, String direcao, int ano, float duracao) {
        super(titulo, direcao, ano, duracao);
        this.genero = genero;
        this.produtora = produtora;
    }
    
    
}
