import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
      
        ArrayList <Integer> numeros = new ArrayList <Integer>();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce 10 números enteros");
        
        for (int i = 0; i < 10; i++) {
            numeros.add(sc.nextInt());
        }
        
        Collections.sort(numeros);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
    }    
}
