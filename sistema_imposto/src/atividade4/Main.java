package atividade4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //atributos
        String nomeEmpresa, tipoImposto;
        double credito, debito, valorProduto, frete, seguro, outrasDespesas, aliquota;
        Scanner input = new Scanner(System.in);
        
        //solicitando nome da empresa
        System.out.println("Informe o nome da empresa: ");
        nomeEmpresa = input.nextLine();
        Pagamentos pagamento = new Pagamentos(nomeEmpresa);
        
        //informando o tipo do imposto
        while(true) {
            System.out.println("Informe o tipo de imposto (PIS ou IPI) ou 'pare' para finalizar.");
            tipoImposto = input.nextLine();
            
            if (tipoImposto.equalsIgnoreCase("pare")){
                break;
            }
            
            //se for PIS
            if (tipoImposto.equalsIgnoreCase("pis")){
                System.out.println("Informe o valor do débito: ");
                debito = input.nextDouble();
                
                System.out.println("Informe o valor do crédito: ");
                credito = input.nextDouble();
                input.nextLine();
                
                Pis pis = new Pis (debito, credito);
                pagamento.adicionarImposto(pis);
                
            //se for IPI
            } else if (tipoImposto.equalsIgnoreCase("ipi")) {
                System.out.println("Informe o valor do produto: ");
                valorProduto = input.nextDouble();
                
                System.out.println("Informe o valor do frete: ");
                frete = input.nextDouble();
                
                System.out.println("Informe o valor do seguro: ");
                seguro = input.nextDouble();
                
                System.out.println("Informe o valor de outras despesas: ");
                outrasDespesas = input.nextDouble();
                
                System.out.println("Informe a alíquota (%): ");
                aliquota = input.nextDouble();
                input.nextLine();
                
                Ipi ipi = new Ipi(valorProduto, frete, seguro, outrasDespesas, aliquota);
                pagamento.adicionarImposto(ipi);
                
            } else {
                System.out.println("Tipo de imposto inválido!");
            }
        }
        
        //exibindo 
        pagamento.exibirImpostos();
        
    }
    
}
