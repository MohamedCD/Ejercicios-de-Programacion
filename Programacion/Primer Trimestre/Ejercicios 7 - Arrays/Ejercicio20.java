import java.util.Scanner;

public class Ejercicio20{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numReyes, orden;
                
        System.out.print("Introduzca el número total de nombres de reyes: ");
        numReyes = sc.nextInt();
        
        sc.nextLine();
        
        String[] reyes = new String[numReyes];
        
        System.out.println("Introduce los nombres de los reyes");
        for (int i = 0; i < reyes.length; i++) {
            reyes[i] = sc.nextLine();
        } 

        for (int i = 0; i < reyes.length; i++) {
            orden = 1;
            for (int j = 0; j < i; j++) {
                if (reyes[i].equals(reyes[j])) {
                    orden++;
                }
            }
            System.out.println(reyes[i] + " " + orden + "º");
        }
    }
}