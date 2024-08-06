package heranca;

public class arquivoImagem extends arquivo {
    
    @Override
    public void abrirArquivo() {
        System.out.println("Arquivo abrindo no paint.");
    }

    @Override
    public String getExtensao() {
        return "jpg";
    }
    
}
