package heranca4.e;

public class personagem {
    //modificadores de acesso = private, public etc
    //modificadores de sem acesso = final, abstract
    
    //modificador final: nao pode ser sobrescrito por outras subclasses
    
    private String nome;
    private String classe;
    private int nivel;

    public personagem(String nome) {
        this.nome = nome;
        this.classe = "nenhuma";
        this.nivel = 1;
    }

    @Override
    public String toString(){
        String informacoes = String.format("%s (nivel: %d) - Classe: %s", nome, nivel, classe);
        return informacoes;
    }
    
    public void atacar(){
        System.out.println("O personagem atacou.");
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
}
