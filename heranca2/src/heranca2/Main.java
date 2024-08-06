package heranca2;

public class Main {

    public static void main(String[] args) {
        Vendedor joao;
        Administrativo maria;

        joao = new Vendedor();
        joao.nome = "João Cerqueira";
        joao.salario = 1000;
        joao.comissao = 10;

        maria = new Administrativo();
        maria.nome = "Maria Eduarda";
        maria.salario = 2000;
        maria.cargo = "contadora";

        System.out.println("Vendedor> Nome: " + joao.nome + ", salario: " + joao.salario + ", comissao: " + joao.comissao + "%");
        System.out.println("Administrativo> Nome: " + maria.nome + ", salario: " + maria.salario + ", cargo: " + maria.cargo);

        joao.aplicaAumento(500); //método definido na superclasse...
        maria.aplicaAumento(300);//...que pode ser invocado pela classe derivada

        System.out.println("Salário de " + joao.nome + " agora é " + joao.salario);
        System.out.println("Salário de " + maria.nome + " agora é " + maria.salario);
    }

}
