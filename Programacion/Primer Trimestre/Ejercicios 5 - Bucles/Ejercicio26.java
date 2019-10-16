import java.util.Scanner;

public class Ejercicio26{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num, numRev = 0, digito;
        int longitud = 0;
        
        System.out.println("Introduce un número");
        num = sc.nextInt();
        
        System.out.println("Introduce un dígito");
        digito = sc.nextInt();
        
        while (num > 0) {
            numRev = (numRev * 10) + (num % 10);
            num /= 10;
            longitud++;
        } 
        
        for (int i = 1; i <= longitud; i++) {
            
            if ((numRev % 10) == digito) {
                System.out.print(i + " ");
            }
            numRev /= 10;
        }        
    }
}