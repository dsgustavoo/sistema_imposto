package heranca;

public class Heranca {

    public static void main(String[] args) {
        arquivo[] arquivos = new arquivo[4];
        
        arquivos[0] = new arquivoVideo();
        arquivos[0].setNome("video1");
        arquivos[1] = new arquivoImagem();
        arquivos[1].setNome("imagem1");
        arquivos[2] = new arquivoTexto();
        arquivos[2].setNome("texto1");
        arquivos[3] = new arquivoImagem();
        arquivos[3].setNome("imagem2");
        
        for (int i = 0; i < arquivos.length; i++) {
            arquivos[i].abrirArquivo();
            
            System.out.println(arquivos[i].getNomeCompleto());
        }
    }
    
}
