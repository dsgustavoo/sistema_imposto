package manipulacao_string_data;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class Manipulacao_string_data {

    public static void main(String[] args) {
        
        //upper case = maiusculo
        //lower case = minusculo
        //length quantidade de letras
        String nome = "Gustavo";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());
        
        //equals vai me responder true ou false se é igual a outra string
        //se colocar equalsIgnoreCase vai ignorar maiusculos
        String nomeOutro = "gustavo";
        System.out.println(nome.equalsIgnoreCase(nomeOutro));
        
        //para usar datas:
        //YYYY-MM-DD
        LocalDate hoje = LocalDate.now();
        //pra traduzir o dia da semana
        Locale brasil = new Locale("pt", "BR"); 
        //pra exibir o dia da semana 
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "Olá";
        }
        
        System.out.println("Olá " + nome + ", hoje é " + diaSemana + "! " + saudacao.toUpperCase());
    }
    
}
