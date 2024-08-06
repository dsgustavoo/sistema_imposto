package polimorfismo2;

public class JogoAcao extends Game{

    //sobrescrevendo o metodo jogar
    @Override
    public void jogar() {
        System.out.println("Jogando um game de ação.");
    }

    @Override
    public int calcularPontuacao(int base) {
        return base * 2;
    }
    
    
}
