package polimorfismo;

public class Serie extends Filme{
    private int temporadas, episodiosPorTemporada;
    private int episodioAtual, temporadaAtual;

    public Serie(int temporadas, int episodiosPorTemporada, String nome) {
        super(nome);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;
    }

    @Override
    public String toString() {
        String informacao = String.format("Série %s %dx%02d(audio %s, legenda %s)", getNome(), temporadaAtual, episodioAtual, getAudio(), getLegenda());
        return informacao;
    }


    public void play(int temporada, int episodio) {
        if (validarEpisodio(temporada, episodio)) {
        this.temporadaAtual = temporada;
        this.episodioAtual = episodio;
            System.out.println("Play: " + toString());    
        } else {
            System.out.println("Episodio invalido");
        }
    }

    private boolean validarEpisodio(int temporada, int episodio) {
        if (temporada == 0 || episodio == 0) {
            return false;
        } else if (temporada > temporadas || episodio > episodiosPorTemporada) {
            return false;
        } else {
            return true;
        }
    }
    
    
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getEpisodioAtual() {
        return episodioAtual;
    }

    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }
    
    
}
