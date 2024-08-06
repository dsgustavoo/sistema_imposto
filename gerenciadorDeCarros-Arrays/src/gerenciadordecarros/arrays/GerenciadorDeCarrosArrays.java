package gerenciadordecarros.arrays;

import java.util.Scanner;

public class GerenciadorDeCarrosArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Solicitar o tamanho do vetor
        System.out.println("Digite o número de carros para cadastrar:");
        int tamanho = input.nextInt();
        input.nextLine(); //Consumir a quebra de linha
        
        //Criar um vetor para armazenar os carros:
        String[] carros = new String[tamanho]; //o tamanho do vetor vai ser a quantidade digitada no scanner
        
        //Preencher o vetor com os nomes dos carros:
        for (int i = 0; i < carros.length; i++) { //length retorna o numero de caracteres na mesma posição
            System.out.println("Digite o nome do carro " + (i + 1) + ":");
            carros[i] = input.nextLine();
        }
        
        //Perguntar para o usuario se ele deseja realizar uma pesquisa
        System.out.println("Deseja pesquisar um carro? (sim/não)");
        String resposta = input.nextLine();
        
        while (resposta.equalsIgnoreCase("sim")) {            
            //perguntar qual carro deseja pesquisar:
            System.out.println("Digite o nome do carro a ser pesquisado:");
            String carroPesquisado = input.nextLine();
            
            //procurar o carro no vetor:
            int indice = -1; //valor padrao caso o carro não seja encontrado.
            
            for (int i = 0; i < carros.length; i++) {
                if (carros[i].equalsIgnoreCase(carroPesquisado)) {
                    indice = i;
                    break;
                }   
            }
            if (indice != -1) {
                System.out.println("Carro encontrado no índice " + indice);
            } else {
                System.out.println("Carro não encontrado.");
            }
            
            //Perguntar se deseja realizar outra pesquisa.
            System.out.println("Deseja realizar outra pesquisa? (sim/não)");
            resposta = input.nextLine();
        }
        
        System.out.println("Programa encerrado.");
        
    }
    
}
