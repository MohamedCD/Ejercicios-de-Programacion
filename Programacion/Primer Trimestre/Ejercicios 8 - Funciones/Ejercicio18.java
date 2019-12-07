import funciones.Funciones;
import java.util.Scanner;

public class Ejercicio18{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int decimal;
        String binario = "";
        
        System.out.print("Introduzca un número decimal: ");
        decimal = sc.nextInt();
        
        do {
            binario = decimal % 2 + binario ;
            decimal /= 2;
            
        } while (decimal > 0);
        
        System.out.println(binario);
    }
}
