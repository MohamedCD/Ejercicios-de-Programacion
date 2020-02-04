import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        HashMap <String, String> habitad = new HashMap <String, String> ();
        HashMap <String, String> alimentacion = new HashMap <String, String> ();
        
        String anfibio;
        
        habitad.put("rana", "En los trópicos y cerca de las zonas húmedas y acuáticas");
        habitad.put("salamandra", "Ecosistemas húmedos");
        habitad.put("sapo", "En cualquier sitio salvo el desierto y la Antártida");
        habitad.put("triton", "América y África");
        
        alimentacion.put("rana", "Larvas e insectos");
        alimentacion.put("salamandra", "Pequeños crustáceos o insectos");
        alimentacion.put("sapo", "Insectos, lombrices y pequeños roedores");
        alimentacion.put("triton", "Insectos");
        
        System.out.print("Introduzca el tipo de anfibio: ");
        anfibio = sc.nextLine();
        
        if (habitad.containsKey(anfibio)) {
            System.out.println("Hábitad: " + habitad.get(anfibio));
            System.out.println("Alimentación: " + alimentacion.get(anfibio));
        } else {
            System.out.println("Ese tipo de anfibio no existe.");
        }
        
    }
}
