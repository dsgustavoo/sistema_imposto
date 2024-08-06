package heranca;

public abstract class arquivo {
    private String nome;
    private int tamanho;
    String extensao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getNomeCompleto() {
        return nome + "." + getExtensao();
    }
    
    public void deletarArquivo() {
        System.out.println("Deletando o arquivo.");
    }
    
    public abstract void abrirArquivo(); //método abstrato não deve ter corpo {}
    
    public abstract String getExtensao();
}
