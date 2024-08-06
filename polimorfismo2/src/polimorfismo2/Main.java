package polimorfismo2;

public class Main {

    public static void main(String[] args) {
        Game meuJogo = new JogoAcao();
        meuJogo.jogar();
        System.out.println("Pontuação no jogo de ação: " + meuJogo.calcularPontuacao(1000));
        
        System.out.println("-----------");
        
        Game meuJogo2 = new JogoAventura();
        meuJogo2.jogar();
        System.out.println("Pontuação no jogo de aventura: " + meuJogo2.calcularPontuacao(1000));
    }
    
}
