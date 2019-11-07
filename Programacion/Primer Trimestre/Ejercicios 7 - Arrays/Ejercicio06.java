import java.util.Scanner;

public class Ejercicio06{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] num = new int[15];
        int [] num2 = new int[15];
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce un número");
            num [i] = sc.nextInt();
        } 

        System.out.println();
        num2[0] = num[14];
        
        for (int i = 1; i < num2.length; i++) {
            num2 [i] = num[i]-1;
        } 
        
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
    }
}