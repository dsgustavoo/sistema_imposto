package heranca;

public class arquivoTexto extends arquivo {

    @Override
    public void abrirArquivo() {
        System.out.println("Arquivo abrindo em um editor de texto.");
    }

    @Override
    public String getExtensao() {
        return "txt";
    }
   
}
