package while_dowhile;
import java.util.Scanner;
public class While_dowhile {

    public static void main(String[] args) {
        
        // contando de 1 a 10 com o while
        
        /* int contador = 1;
        
        while (contador <= 10) {
            System.out.println("este é o numero " + contador);
            contador++;
        } */
        
        // contando de 1 a 10 com o do while
        
       /* int i = 1;
        
        do {
            System.out.println("Numero " + i);
            i++;
        } while (i <= 10);
        */
        
       //exemplo mais complexo:
       Scanner input = new Scanner(System.in);
       
       float tempoVolta = 0.0f, menorTempo;
       String continuar = "S";
       
       //inicializando o menor tempo com o maior possivel, qualquer valor informado sera menor q este:
       menorTempo = Float.MAX_VALUE;
       
       while (continuar.equals("S")) {
           System.out.println("Informe o tempo da volta do velocista: ");
           tempoVolta = input.nextFloat();
           
           //este nextline é necessario para que o proximo nextline ao fim do laço nao falhe
           input.nextLine(); //consome o enter digitado pelo uusuario
           
           if (menorTempo > tempoVolta) {
               menorTempo = tempoVolta; 
           }
           
           System.out.println("Deseja informar novo tempo? S/N ");
           continuar = input.nextLine();
       }
        System.out.println("A menor volta do velocista foi: " + tempoVolta + " segundos.");
    }
    
}
