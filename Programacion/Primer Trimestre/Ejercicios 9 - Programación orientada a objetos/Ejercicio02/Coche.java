package ejercicio02;

public class Coche extends Vehiculo{
   
    private int cilindrada; 
    
    public Coche(int cilindrada) {
        super();
        this.cilindrada = cilindrada;
    }
    
    public void quemaRueda() {
        System.out.println("Estoy quemando rueda");
    }
}
