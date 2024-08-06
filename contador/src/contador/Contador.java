package contador;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        
        int numeroInicial, numeroFinal;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o número inicial: ");
        numeroInicial = entrada.nextInt();
        
        System.out.println("Digite o número final: ");
        numeroFinal = entrada.nextInt();
        
        //verificar se o numero inicial é menor ou igual que o numero final
        if (numeroInicial <= numeroFinal) {
            //contador do numero inicial ao numero final
            System.out.println("--Contagem--");
            
            for (int i = numeroInicial; i <= numeroFinal; i++) {
                System.out.println(i);
            }
            
        } else {
            //mensagem de erro se o numero inicial for maior que o final
            System.out.println("O número inicial deve ser menor ou igual ao número final.");
        }
    }
    
}
