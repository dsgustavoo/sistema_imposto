package registrodealunos.matriz;

import java.util.Scanner;

public class RegistroDeAlunosMatriz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Matriz para armazenar os nomes dos 4 alunos.
        String[] nomes = new String[4];
        
        //Matriz para armazenar 3 notas para cada aluno.
        double[][] notas = new double[4][3];
        
        //preencher os dados dos alunos
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o nome do aluno " + (i+1) + ":"); //nomes
            nomes[i] = input.nextLine();
            
            for (int j = 0; j < 3; j++) { //notas
                System.out.println("Digite a nota " + (j+1) + " do aluno " + nomes[i] + ":");
                notas[i][j] = input.nextDouble();
            }
        input.nextLine();
        }
        
        //Exibir a matriz em forma de tabela sem as medias
        System.out.println("\nTabela de notas:");
        System.out.println("Aluno \tNota 1 \tNota 2 \tNota 3");
        
        for (int i = 0; i < 4; i++) {
            System.out.print(nomes[i] + "\t");
            
            for (int j = 0; j < 3; j++) {
                System.out.print(notas[i][j] + "\t");
            }
            System.out.println();
        }
        
        
        
    }
    
}
