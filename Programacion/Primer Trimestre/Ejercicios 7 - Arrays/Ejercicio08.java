import java.util.Scanner;

public class Ejercicio08{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] num = new int[12];
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduzca la temperatura del mes " + (i+1));
            num[i] = sc.nextInt();
        } 

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}