import java.util.Scanner;

public class Ejercicio20{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int capacidad, num;
         
        System.out.println("Introduzca la capacidad de la cuba");
        capacidad = sc.nextInt();
        
        num = (int) (Math.random() * (capacidad + 1));
        System.out.println(num);

        for (int i = 0; i < capacidad; i++) {
            System.out.print("*");

            if (i == capacidad - num || i > capacidad - num) {
                System.out.print("####");
            }else{
                System.out.print("    ");
            }
        
            System.out.print("*");
            System.out.println();
        }
        
        System.out.println("******");
    }
}