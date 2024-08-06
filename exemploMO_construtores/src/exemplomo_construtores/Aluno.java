package exemplomo_construtores;

public class Aluno {
    //atributos
    String nome;
    int idade;
    double nota;
    
    //método construtor. TECLE ALT + INSERT

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    
    //método para exibir informações do aluno
    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", idade: " + idade + ", nota: " + nota);
    }
    
    //método para calcular media
    public double calcularMedia() {
        return nota / 10;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + '}';
    }
    
    
}
