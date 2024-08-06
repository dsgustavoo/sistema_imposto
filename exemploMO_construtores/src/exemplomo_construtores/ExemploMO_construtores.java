package exemplomo_construtores;

public class ExemploMO_construtores {

    public static void main(String[] args) {

        //POR USAR UM CONSTRUTOR NA CLASSE ALUNO, É PRECISO PASSAR OS ATRIBUTOS COMO PARÂMETRO:
        Aluno aluno1 = new Aluno("Gustavo", 24, 70);
        Aluno aluno2 = new Aluno("Maria", 25, 90);

        //mostrar as informações do aluno 1
        aluno1.exibirInfo();
        System.out.println("Média: " + aluno1.calcularMedia());

        //mostrar as informações do aluno 2
        aluno2.exibirInfo();
        System.out.println("Média: " + aluno2.calcularMedia());

        
        System.out.println(aluno1.toString());
    }

}
