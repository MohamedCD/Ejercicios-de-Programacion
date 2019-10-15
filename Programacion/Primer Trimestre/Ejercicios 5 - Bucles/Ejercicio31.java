import java.util.Scanner;

public class Ejercicio31{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int altura;
       
        System.out.println("Introduce la altura");
        altura = sc.nextInt();
        
        for (int i = 0; i < altura - 1; i++) {
            System.out.println("*");
        }
        
        for (int i = 0; i < altura/2 + 1; i++) {
            System.out.print("* ");
        }
        
        System.out.println();      
    }
}