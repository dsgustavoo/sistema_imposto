package array.classe;

import java.util.Scanner;

public class ArrayClasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        //perguntar ao usuario quantas pessoas ele deseja armazenar
        System.out.println("Quantas pessoas você deseja armazenar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        
        Pessoa[] pessoas = new Pessoa[quantidade];
        
        //ler o nome de cada pessoa e armazenar no array
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome da pessoa " + i+1 + ":");
            String nome = scanner.nextLine();
            pessoas[i] = new Pessoa(nome); //serve para armezar os nomes como objeto em cada posição do array
        }
        
        //exibir os nomes das pessoas armazenadas
        System.out.println("Nome das pessoas armazenadas:");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i].nome);
        }
    }
    
}
