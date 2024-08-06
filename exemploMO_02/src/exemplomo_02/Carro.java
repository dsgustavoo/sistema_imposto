package exemplomo_02;

public class Carro {

    //atributos
    String marca, modelo;
    int velocidade;

    //método para acelerar o carro
    public void acelerar (int aumentoVelocidade) {
        velocidade += aumentoVelocidade;
        System.out.println("Carro acelerando! Velocidade atual: " + velocidade + "km/h");
    }

    //método para frear o carro
    public void frear (int reducaoVelocidade) {
        velocidade = velocidade - reducaoVelocidade;
        if (velocidade < 0) {
            velocidade = 0;
        }
        System.out.println("Carro freando! Velocidade atual: " + velocidade + "km/h");
    }
}
