package exemplo_variaveis;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exemplo_variaveis {
    public static void main(String[] args) {
    //trecho de código que fornecerá o ano atual
    Calendar cal = GregorianCalendar.getInstance();
    
    //o objeto "cal" fornecerá o ano atual por meio do método get(Calendar.YEAR)
    int anoAtual = cal.get(Calendar.YEAR);
    
    //imagine que o usuario nasceu em 1999
    int anoNasc = 1999;
    int idade = anoAtual - anoNasc;
    
    System.out.println("Você tem: " + idade + " anos de idade");
    }
}
