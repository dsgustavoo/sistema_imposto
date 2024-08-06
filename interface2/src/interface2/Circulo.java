package interface2;

public class Circulo implements FormaGeometrica {
    private double raio;

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    

    @Override
    public double calculaArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }
    
}
