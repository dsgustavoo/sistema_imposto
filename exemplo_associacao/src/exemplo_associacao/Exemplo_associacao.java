package exemplo_associacao;

public class Exemplo_associacao {

    public static void main(String[] args) {
        //Criação dos objetos
        Pessoa pessoa = new Pessoa("Maria");
        Cachorro cachorro = new Cachorro("Rex");
        
        //Associação
        pessoa.adotarPet(cachorro);
        
        //Exibir informações
        pessoa.mostrarInformacoes();
    }

}
