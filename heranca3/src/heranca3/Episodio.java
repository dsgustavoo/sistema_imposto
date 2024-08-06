package heranca3;

public class Episodio extends Video {
    public int episodio, temporada;

    public Episodio(int episodio, int temporada, String titulo, String direcao, int ano, float duracao) {
        super(titulo, direcao, ano, duracao);
        this.episodio = episodio;
        this.temporada = temporada;
    }
    
    
}
