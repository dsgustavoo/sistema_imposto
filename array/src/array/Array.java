package array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        //como declarar um array (vetor)
        //um array com 5 numeros vai do indice 0 ao 4
        
        int[] numeros = {9, 10, 12, 25, 2};
        
        //como exibir a array no console (precisa importar java.util.Arrays
        System.out.println(Arrays.toString(numeros));
        
        //como descobrir maior, menor e media de elementos da array:
        //precisa inicializar a variavel com o 1 indice
        int maior = numeros[0], menor = numeros[0], media = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media = media += numeros[i];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media/numeros.length);
        
    }
    
}
