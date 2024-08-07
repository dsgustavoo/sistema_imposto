package atividade4;

import java.util.List;
import java.util.ArrayList;

public class Pagamentos {
    //atributos
    private String nomeEmpresa;
    private List<Imposto> impostos;
    
    //construtor
    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.impostos = new ArrayList<>();
    }
    
    //métodos
    public void adicionarImposto(Imposto imposto) {
        impostos.add(imposto);
    }
    
    public void exibirImpostos() {
        for (Imposto imposto : impostos) {
            System.out.println("Imposto: " + imposto.descricao() + ", valor: " + imposto.calcularImposto());
        }
    }
}
