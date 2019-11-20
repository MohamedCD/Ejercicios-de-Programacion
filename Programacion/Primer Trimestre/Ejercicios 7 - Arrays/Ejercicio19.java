import java.util.Scanner;

public class Ejercicio19{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                
        int[] num = new int[12];
        int[] resultado = new int[12];
        int numero, posicion;

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 201);
            System.out.print(num[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("Introduzca un número");
        numero = sc.nextInt();
      
        System.out.println("Introduzca su posición (0-11)");
        posicion = sc.nextInt();
        
        for (int i = 0; i < posicion; i++) {
            resultado[i] = num[i];
        }
        
        resultado[posicion] = numero;
        
        for (int i = posicion + 1; i < resultado.length; i++) {
            resultado[i] = num[i-1];
        }
        
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}