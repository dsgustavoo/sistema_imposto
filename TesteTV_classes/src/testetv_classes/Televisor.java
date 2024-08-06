package testetv_classes;

public class Televisor {
    int canal, volume;
    boolean ligada = false;
    
    public void ligar (){
        ligada = true;
        System.out.println("A TV está ligada.");
    }
    
    public void desligar (){
        ligada = false;
        System.out.println("A TV está desligada.");
    }
    
    public void trocarCanal (int novoCanal){
        if (!ligada) { //! é o operador "não"
            System.out.println("A TV está desligada!");
        } else { //só realizará a operação se a tv estiver ligada
            if (novoCanal > 1 && novoCanal < 14) { //canais vao so de 2 a 13
                canal = novoCanal;
                System.out.println("Canal " + canal + " sintonizado.");
            } else {
                System.out.println("Canal inválido");
            }
        }
    }
    
    public void aumentarVolume() {
        if (!ligada) {
            System.out.println("A TV está desligada!");
        } else { //só realizará a operação se a tv estiver ligada
            if (volume < 100) { //volume maximo é 100
                volume++;
            }
        }
    }
    
    public void diminuirVolume() {
        if (!ligada) {
            System.out.println("A TV está desligada!");
        } else { //só realizará a operação se a tv estiver ligada
            if (volume > 0) { //volume minimo é 0
                volume--;
            }
        }
    }
    
    public void display() {
        if (!ligada) {
            System.out.println("A TV está desligada!");
        } else {
            System.out.println("Canal: " + canal);
            System.out.println("Volume: " + volume);
        }
    }
    
}
