import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        HashMap <String, String> traductor = new HashMap <String, String>();
        HashMap <Integer, String> traductorPos = new HashMap <Integer, String>();
        
        int i = 1, num, puntuacion = 0;
        String cad;
                
        traductor.put("Hola", "Hello");
        traductor.put("Adiós", "Bye");
        traductor.put("Perro", "Dog");
        traductor.put("Gato", "Cat");
        traductor.put("Mesa", "Table");
        
        traductor.put("Silla", "Chair");
        traductor.put("Portátil", "Laptop");
        traductor.put("Teclado", "Keyboard");
        traductor.put("Ratón", "Mouse");
        traductor.put("Móvil", "Mobile");
        
        traductor.put("Agua", "Water");
        traductor.put("Lluvia", "Rain");
        traductor.put("Sol", "Sun");
        traductor.put("Nube", "Cloud");
        traductor.put("Pantalla", "Screen");
        
        traductor.put("Ventana", "Window");
        traductor.put("Gafas", "Glasses");
        traductor.put("Cara", "Face");
        traductor.put("Ojos", "Eyes");
        traductor.put("Nariz", "Nouse");
        
        for (Map.Entry palabra: traductor.entrySet()) {
            traductorPos.put(i, (String) palabra.getKey());
            i++;
        }
        
        for (int j = 0; j < 5; j++) {
            num = (int) (Math.random() * 20) + 1;
            System.out.println(traductorPos.get(num));
            cad = sc.nextLine();
            if (traductor.get(traductorPos.get(num)).equals(cad)) {
                System.out.println("Has acertado");
                puntuacion++;
            } else {
                System.out.println("Has fallado");
            }
        }
        
        System.out.println("Tu puntuación ha sido de un: " + puntuacion);

    }
}