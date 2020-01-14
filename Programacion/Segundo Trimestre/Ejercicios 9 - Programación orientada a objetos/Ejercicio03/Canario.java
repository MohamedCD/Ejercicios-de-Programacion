package Ejercicio03;

public abstract class Canario extends Ave{
    
    Canario(String nSexo) {
        super(nSexo);
    }
    
    Canario(){
        super();
    }
    
    public void canta() {
        System.out.println("Tralaralariiiiiiii");
    }
    public void caza() {
        System.out.println("Los canarios no cazan");
    }

    public void pia() {
        System.out.println("Pio pio pio");
    }
}
