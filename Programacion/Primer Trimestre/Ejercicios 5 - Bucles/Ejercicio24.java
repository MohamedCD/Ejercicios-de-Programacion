import java.util.Scanner;

public class Ejercicio24{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        String espacio = " ";

        int altura;
       
        System.out.println("Introduce la altura de la pirámide");
        altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            
            for (int j = i; j < altura; j++) {
                System.out.print(espacio);
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            
            for (int k = i; k > 1; k--) {
                System.out.print(k-1);
            }
            
            System.out.println();
        }
    }
}