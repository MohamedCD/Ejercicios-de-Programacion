import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] numero = new int[100];
        int numMax = 0, numMin = 100, opcion;
        
        for (int i = 0; i < numero.length; i++) {
            numero [i] = (int) (Math.random() * 501);
            
            if (numMax < numero[i]) {
                numMax = numero[i];
            }
            
            if (numMin > numero[i]) {
                numMin = numero[i];
            }
        }
        
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
            
            if (i % 20 == 0 && i != 0) {
                System.out.println();
            }
        }
        
        System.out.print("\n¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
        opcion = sc.nextInt();
        
        for (int i = 0; i < numero.length; i++) {
            if (opcion == 1 && numero[i] == numMin) {
                System.out.print(" **" + numero[i] + "** ");
            }
            else if (opcion == 2 && numero[i] == numMax){
                System.out.print(" **" + numero[i] + "** ");
            }
            else{
                System.out.print(numero[i] + " ");
            }
            
            if (i % 20 == 0 && i != 0) {
                System.out.println();
            }
        }
    }
}