import funciones.Funciones;
import java.util.Scanner;

public class Ejercicio17{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int binario, decimal = 0, longitud;
        
        System.out.print("Introduzca un número binario: ");
        binario = sc.nextInt();

        longitud = funciones.Funciones.digitos(binario);
        
        for (int i = 0; i < longitud; i++) {
            if (binario % 2 != 0) {
                decimal += funciones.Funciones.potencia(2, i);
            }
            binario /= 10; 
        }
        
        System.out.println(decimal);
        
    }
}
