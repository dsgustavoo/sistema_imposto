package polimorfismo2;

public class JogoAventura extends Game{
    
    @Override
    public void jogar() {
        System.out.println("Jogando um jogo de aventura.");
    }

    @Override
    public int calcularPontuacao(int base) {
        return base + 100;
    }
    
    
}
