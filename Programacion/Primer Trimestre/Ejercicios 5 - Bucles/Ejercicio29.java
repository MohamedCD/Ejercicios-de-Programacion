import java.util.Scanner;

public class Ejercicio29{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1, num2;
       
        System.out.println("Introduce un número");
        num1 = sc.nextInt();
        
        System.out.println("Introduce otro número");
        num2 = sc.nextInt();
        
        for (int i = num1; i > 0; i--) {
            if (i%num2 != 0) {
                System.out.println(i);
            }
        }
    }
}