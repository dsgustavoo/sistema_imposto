package alunoapp_classes;

public class AlunoApp_classes {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        
        aluno1.nome = "Celso medeiros";
        aluno1.nota1 = 9.7f;
        aluno1.nota2 = 6.5f;
        
        aluno2.nome = "Camila Silva";
        aluno2.nota1 = 4.2f;
        aluno2.nota2 = 6.5f;
        
        System.out.println("Mostrar alunos:\n");
        
        //aluno1:
        aluno1.descrever();
        System.out.println("A média do aluno é: " + aluno1.calcularMedia(aluno1.nota1, aluno1.nota2));
        
        System.out.println("A maior nota do aluno é: " + aluno1.mostrarMaior());
        aluno1.mostrarResultado();
        System.out.println("\n");
        
        //aluno2:
        aluno2.descrever();
        System.out.println("A média do aluno é: " + aluno2.calcularMedia(aluno2.nota1, aluno2.nota2));
        
        System.out.println("A maior nota do aluno é: " + aluno2.mostrarMaior());
        aluno2.mostrarResultado();
        
    }
}
