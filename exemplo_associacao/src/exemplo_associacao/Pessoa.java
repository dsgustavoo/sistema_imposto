package exemplo_associacao;

public class Pessoa {
   
    String nome;
    Cachorro pet; //nome da classe + nome do objeto
    
    //construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public void adotarPet(Cachorro pet) {
        this.pet = pet;
    }
    
    public void mostrarInformacoes() {
        System.out.println("Nome da pessoa: " + nome);
        if (pet != null) {
            System.out.println("Nome do pet: " + pet.nome);
        }
    }
}
