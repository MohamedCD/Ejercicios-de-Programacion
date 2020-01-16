package ejercicio02;

public class Ejercicio02 {
    public static void main(String[] args) {
        
        Gato[] gato = new Gato[4];
        
        gato[0] = new Gato("Garfield", "naranja", "mestizo");
        gato[1] = new Gato("Pepe", "gris", "angora");
        gato[2] = new Gato("Mauri", "blanco", "manx");
        gato[3] = new Gato("Ulises", "marrón", "persa");
        
        for (int i = 0; i < gato.length; i++) {
            System.out.println("Los datos del gato " + (i+1) + " son:");
            System.out.println("Nombre: " + gato[i].getNombre());
            System.out.println("Color: " + gato[i].getColor());
            System.out.println("Raza: " + gato[i].getRaza());
        }   
    } 
}
