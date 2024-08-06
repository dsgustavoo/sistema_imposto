package heranca;

public class arquivoVideo extends arquivo{
    private float duracao;

    public float getDuracao() {
        return duracao;
    }
    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    @Override
    public void abrirArquivo() {
        System.out.println("Abrindo em um reprodutor de mídia");
    }

    @Override
    public String getExtensao() {
        return "mp4";
    }
    
    
}
