package carros_getset;

public class Carros_getSet {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Ka", "Ford", "Branco", 2020);
        Carro carro2 = new Carro("Gol", "Volkswagen", "Preto", 2010);
        
        System.out.println("Dados do carro 1:");
        System.out.println("Modelo do primeiro carro é: " + carro1.getModelo()); //usei o GET para printar o resultado na tela
        carro1.setModelo("Ranger"); //usei o SET para alterar o modelo de KA para RANGER
        System.out.println("Modelo do primeiro carro após o SET: " + carro1.getModelo());
        
        System.out.println("\nDados do carro 2:");
        System.out.println("Marca do segundo carro é: " + carro2.getMarca());
        carro2.setMarca("Volks");
        System.out.println("Marca do segundo carro após o SET: " + carro2.getMarca());
    }
    
}
