package interface2;

public class main {

    public static void main(String[] args) {
        //instanciando circulo
        Circulo c = new Circulo();
        c.setRaio(5.0);
        //calculando
        System.out.println("Área do círculo: " + c.calculaArea());
        System.out.println("Perímetro do círculo " + c.calculaPerimetro());
        
        //instanciando retangulo
        Retangulo r = new Retangulo();
        r.setAltura(10);
        r.setBase(5);
        //calculando
        System.out.println("Área do retângulo: " + r.calculaArea());
        System.out.println("Perímetro do retângulo: " + r.calculaPerimetro() + "\n");
        
        //vetor de formas geométricas genérico. 
        //invocando os métodos previstos pelo contrato da interface FormaGeometrica, sem se preocupar se o item é um círculo ou retângulo – se eles implementam FormaGeometrica, 
        //tenha certeza de que eles sabem calcular a área e o perímetro da forma
        
        FormaGeometrica formas[] = new FormaGeometrica[2];
        formas[0] = c;
        formas[1] = r;
        
        for (int i = 0; i < formas.length; i++) {
            System.out.println("OUTRA MANEIRA:");
            System.out.println("Area da forma " + i +": " + formas[i].calculaArea());
            System.out.println("Perímetro da forma " + i +": " + formas[i].calculaPerimetro());
        }
    }
    
}
