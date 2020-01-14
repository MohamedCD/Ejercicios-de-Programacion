package ejercicio02;

public class Bicicleta extends Vehiculo{
    private int pinones;
    
    public Bicicleta(int piñones) {
        super();
        this.pinones = piñones;
    }
    
    public void hazCaballito() {
        System.out.println("Estoy haciendo el caballito");
    }
    
}
