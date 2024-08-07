package atividade4;

public class Pis implements Imposto{
    //Atributos
    private double debito, credito;
    
    //construtor
    public Pis(double debito, double credito) {
        this.debito = debito;
        this.credito = credito;
    }
    
    //metodos
    @Override
    public double calcularImposto() {
        return (debito - credito) * 0.0165;
    }

    @Override
    public String descricao() {
        return "PIS";
    }
    
    //getters e setters
    public double getDebito() {
        return debito;
    }
    public void setDebito(double debito) {
        this.debito = debito;
    }
    public double getCredito() {
        return credito;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }
}
