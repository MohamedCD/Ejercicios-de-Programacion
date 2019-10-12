import java.util.Scanner;

public class Ejercicio28{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num, factorial;

        System.out.println("Introduce un número");
        num = sc.nextInt();

        factorial = num;

        for (int i = 1; i < num; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
