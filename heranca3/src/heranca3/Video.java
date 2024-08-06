package heranca3;

public class Video {
    public String titulo, direcao;
    public int ano;
    public float duracao;

    public Video(String titulo, String direcao, int ano, float duracao) {
        this.titulo = titulo;
        this.direcao = direcao;
        this.ano = ano;
        this.duracao = duracao;
    }
    
    public void tocar() {
        System.out.println("Executando o vídeo '" + titulo + "', dirigido por " + direcao);
    }
}
