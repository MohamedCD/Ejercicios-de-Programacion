import java.util.Scanner;

public class Ejercicio32{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num, numRev = 0, sumaPares = 0, digito;
        int longitud = 0;
        
        System.out.println("Introduce un número");
        num = sc.nextInt();
         
        while (num > 0) {
            numRev = (numRev * 10) + (num % 10);
            num /= 10;
            longitud++;
        } 
        
        for (int i = 0; i < longitud; i++) {
            digito = (int)(numRev % 10);
            if ((digito % 2) == 0) {
                System.out.print(digito + " ");
                sumaPares += digito;
            }
            numRev /= 10;
        }
        
        System.out.println("\nSuma de los dígitos pares: " + sumaPares);
        
    }
}