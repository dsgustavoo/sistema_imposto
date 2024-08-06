package exemplomo_03;

public class Cachorro {
    //atributos
    String nome, raca;
    double peso;

    //construtor
    public Cachorro(String nome, String raca, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }
    
    //método para exibir informações
     public void exibirInfo() {
        System.out.println("Informações do cachorro:");
        System.out.println("Nome: " + nome + ", raça: " + raca + ", peso: " + peso + "kg.");
    }
}
