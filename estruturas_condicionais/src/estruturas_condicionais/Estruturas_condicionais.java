package estruturas_condicionais;

import java.util.Scanner;

public class Estruturas_condicionais {

    public static void main(String[] args) {
        int a, b, resultado;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Entre o valor de A: ");
        a = input.nextInt();
        
        System.out.print("Entre o valor de B: ");
        b = input.nextInt();
        
        resultado = a + b;
        
        if (resultado > 10) {
            System.out.println("A soma dos números é: " + resultado + ", que ultrapassa o valor de 10.");
        } else {
            System.out.println("A soma dos números é: " + resultado + ", que não ultrapassa o valor de 10.");
        }
        System.out.println("Fim do programa.");
    }
    
}
