import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        HashMap <String, String> traductor = new HashMap <String, String>();
        
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
        
        System.out.println("Introduce la palabra que quieras saber: ");
        String palabra = sc.nextLine();
        
        if (traductor.containsKey(palabra)) {
            System.out.println(traductor.get(palabra));
        } else {
            System.out.println("No existe esta palabra en el diccionario");
        }
    }
}