package Ejercicio03;

public class Pinguino extends Ave{
    
    Pinguino(String nSexo) {
        super(nSexo);
    }
    Pinguino() {
        super();
    }
    
    @Override
    public void vuela() {
        System.out.println("Soy un pingüino, no puedo volar");
    }
    
    public void programa() {
        System.out.println("Soy un pingüino programador, estoy programando en Java");
    }
    
    public void nada() {
        System.out.println("Estoy nadando");
    }
}
