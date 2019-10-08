import java.util.Scanner;

public class Ejercicio08{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Introduce un número");
        num = sc.nextInt();
       
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}