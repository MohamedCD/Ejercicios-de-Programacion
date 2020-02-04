import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        HashMap <String, String> capitales = new HashMap <String, String> ();
        
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París");
        capitales.put("España", "Madrid");
        
        String nombrePais, nombreCapital;
        
        for (nombrePais = ""; !nombrePais.equals("salir");) {
            System.out.println("Escribe el nombre de un país y te diré su capital: ");
            nombrePais = sc.nextLine();
            
            if (capitales.containsKey(nombrePais)) {
                System.out.println("La capital de " + nombrePais + " es " + capitales.get(nombrePais));
            } else if(!nombrePais.equals("salir")){
                System.out.println("No conozco la respuesta, ¿cuál es su capital?");
                nombreCapital = sc.nextLine();

                capitales.put(nombrePais, nombreCapital);
            }
        }

    }
}
