package permissao_show;

/**
 *informar idade pra entrar num show
 * >=16 com autorizacao
 * >=18 liberado
 * menor que 16 nao pode
 */

import java.util.Scanner;

public class Permissao_show {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int idade;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int totalLiberados = 0;
        int totalComResponsavel = 0;
        int totalNaoLiberado = 0;
        String resposta;
        
        do {            
            //solicitar a idade da pessoa
            System.out.println("Digite a idade: ");
            idade = entrada.nextInt();
            
            //atualizar a maior e a menor idade
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            
            //verificar a faixa etaria e incrementar os contadores
            if (idade >= 18) {
                totalLiberados++;
                System.out.println("Liberado!");
            } else if (idade >= 16) {
                totalComResponsavel++;
                System.out.println("Liberado com responsável!");
            } else {
                totalNaoLiberado++;
                System.out.println("Não pode ingressar no show!");
            }
            //perguntar se deseja cadastrar outra pessoa
            System.out.println("Deseja cadastrar outra pessoa? (sim/não): ");
            resposta = entrada.next(); 
            
        } while (resposta.equalsIgnoreCase("sim"));
        
        System.out.println("Total liberados: " + totalLiberados);
        System.out.println("Total com responsável: " + totalComResponsavel);
        System.out.println("Total não liberados: " + totalNaoLiberado);
        System.out.println("Maior idade cadastrada: " + maiorIdade);
        System.out.println("Menor idade cadastrada: " + menorIdade);
    }
    
}
