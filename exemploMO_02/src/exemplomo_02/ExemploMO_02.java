package exemplomo_02;

public class ExemploMO_02 {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";

        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        
        carro1.acelerar(50);
        carro1.frear(20);
        carro1.acelerar(50);
        carro1.frear(100);
    }

}
