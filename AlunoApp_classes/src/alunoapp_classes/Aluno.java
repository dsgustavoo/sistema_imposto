package alunoapp_classes;

public class Aluno {

    String nome;
    float nota1, nota2, media;

    /* Primeiro método ainda será void apenas para mostrar os dados principais do aluno */
    public void descrever() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("\n");
    }

    /* método retornando um valor do tipo float, por meio do comando do recebimento de dois parâmetros */
    public float calcularMedia(float nota1, float nota2) {
        return media = (nota1 + nota2) / 2;
    }

    /* método para retornar qual a nota mais alta */
    public float mostrarMaior() {
        if (nota1 >= nota2) {
            return nota1;
        } else {
            return nota2;
        }
    }

    /* método void para mostrar se o aluno foi aprovado ou não */
    public void mostrarResultado() {
        if (media >= 7) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
    }

}
