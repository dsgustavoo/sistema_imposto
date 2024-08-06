package estruturas_condicionais2;

import java.util.Scanner;

public class Estruturas_condicionais2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "latin1"); //latin1 permite acentos
        
        String forma;
        float raio, base, altura, area;
        
        System.out.println("Digite a forma na qual quer calcular a área (retangulo, triangulo ou circulo): ");
        forma = input.nextLine();
        
        switch (forma) //switch é um controle de multipla escolha
        {
            case "retangulo": //caso 1
                System.out.println("Digite primeiro a base depois a altura: ");
                base = input.nextFloat();
                altura = input.nextFloat();
                area = base * altura;
                System.out.println("A área do retângulo é: " + area);
                break; //não pode esquecer do break
                
            case "triangulo":
                System.out.println("Digite primeiro a base depois a altura: ");
                base = input.nextFloat();
                altura = input.nextFloat();
                area = base * altura;
                System.out.println("A área do triângulo é: " + area);
                break;
                
            case "circulo":
                System.out.println("Digite o raio: ");
                raio = input.nextFloat();
                area = 3.1416f * raio * raio;
                System.out.println("A área do círculo é: " + area);
                break;
                
            default:
                System.out.println("Forma não reconhecida.");
                break;
        }
    }
    
}
