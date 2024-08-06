package exemplomo_03;

import java.util.Scanner;

public class ExemploMO_03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        //solicitando ao usuario que insira os dados
        System.out.println("Digite o nome do cachorro: ");
        String nome = entrada.nextLine();
        
        System.out.println("Digite a raça do cachorro: ");
        String raca = entrada.nextLine();
        
        System.out.println("Digite o peso do cachorro (em quilos): ");
        double peso = entrada.nextDouble();
        
        //criar um objeto da classe cachorro usando o construtor
        Cachorro cachorro1 = new Cachorro (nome, raca, peso);
        
        //mostrar dados do cachorro:
        cachorro1.exibirInfo();

    }
    
}
