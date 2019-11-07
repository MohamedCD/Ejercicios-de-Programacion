import java.util.Scanner;

public class Ejercicio09{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] num = new int[8];
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduzca un número");
            num[i] = sc.nextInt();
        } 
        
        System.out.println();

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i] + " --> par");
            }
            else{
                System.out.println(num[i] + " --> impar");
            }
        }
    }
}