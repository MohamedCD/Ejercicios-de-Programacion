import java.util.*;

public class Ejercicio03{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] num = new int[10];
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce un número");
            num [i] = sc.nextInt();
        } 
        
        System.out.println();
        
        for (int i = num.length-1; i > 0; i--) {
            System.out.println(num[i]);
        }
    }
}