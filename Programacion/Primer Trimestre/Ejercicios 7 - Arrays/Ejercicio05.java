import java.util.Scanner;

public class Ejercicio05{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] numero = new int[10];
        int numMax = 0, numMin = 100;
        
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduzca un número");
            numero [i] = sc.nextInt();
            
            if (numMax < numero[i]) {
                numMax = numero[i];
            }
            
            if (numMin > numero[i]) {
                numMin = numero[i];
            }
        } 
        
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i]);
            if (numero[i] == numMax) {
                System.out.print(" --> número máximo");
            }
            if (numero[i] == numMin) {
                System.out.print(" --> número mínimo");
            }
            System.out.println();
        }
    }
}