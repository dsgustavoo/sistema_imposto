package funcoes;

public class Funcoes {

    public static void main(String[] args) {
        String nomeOriginal = "Gustavo";
        saudacao(nomeOriginal);
    }

    //definindo uma funcao de saudacao
    //fora do main
    public static void saudacao(String nomeParametro) {
        System.out.println("Hello, " + nomeParametro);
    }
}
