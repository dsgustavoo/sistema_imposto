package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
        String nome;
        int idade;
        float altura;
        
        //declaração do scanner
        //a palavra "entrada" será o objeto criado
        //é preciso importar o pacote scanner
        Scanner entrada = new Scanner (System.in);
        
        //solicitando os dados para o usuario e armazenando nas variaveis:
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        
        System.out.println("Digite sua altura: (Utilize o separador ,)");
        altura = entrada.nextFloat();
        
        entrada.close(); //fechando o buffer de entrada
        
        //mostrando os dados na tela:
        System.out.println("\nMostrando os dados:\n");
        System.out.println("Seu nome: " + nome);
        System.out.println("\nSua idade: " + idade);
        System.out.println("\nSua altura: " + altura);       
    }
    
}
