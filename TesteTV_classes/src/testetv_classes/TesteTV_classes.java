package testetv_classes;

import java.util.Scanner;

public class TesteTV_classes {

    public static void main(String[] args) {
        //variaveis
        Scanner input = new Scanner(System.in);
        String operacao = "";
        int canal;
        
        Televisor minhaTV = new Televisor(); //instanciando o objeto televisor
        
        do {
            System.out.println("Digite a operação da TV: [L]igar; [D]esligar; [T]rocar canal; [+]Aumentar volume; [-]Diminuir volume; [X]Sair");
            operacao = input.nextLine();
            
            switch (operacao) {
                case "L" -> minhaTV.ligar();
                    
                case "D" -> minhaTV.desligar();
                    
                case "T" -> {
                    System.out.println("Digite o canal desejado (entre 2 e 13): ");
                    canal = input.nextInt();
                    input.nextLine();
                    minhaTV.trocarCanal(canal);
                }
                    
                case "+" -> minhaTV.aumentarVolume();
                    
                case "-" -> minhaTV.diminuirVolume();
                    
                case "X" -> System.out.println("Encerrando o programa.");
                    
                default -> System.out.println("Opção inválida.");
            }
      
        System.out.println("\n");
        minhaTV.display();
        
        } while (!operacao.equalsIgnoreCase("X"));

    }
    
}
