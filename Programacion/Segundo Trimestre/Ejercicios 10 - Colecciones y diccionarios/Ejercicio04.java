import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
      
        ArrayList <String> palabras = new ArrayList <String>();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce 10 números enteros");
        
        for (int i = 0; i < 10; i++) {
            palabras.add(sc.nextLine());
        }
        
        Collections.sort(palabras);

        for (int i = 0; i < palabras.size(); i++) {
            System.out.print(palabras.get(i) + " ");
        }
    }    
}