import java.util.Scanner;

public class Ejercicio15{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] mesa = new int[10];
        
        int numeroComensales;
        boolean mesaVacia = false;
        
        for (int i = 0; i < mesa.length; i++) {
            mesa [i] = (int) (Math.random() * 5);
        }
        
        for (int i = 0; i < mesa.length; i++) {
            System.out.print(mesa[i] +  " ");
        }
        
        System.out.println();
        
        
        do {      
            
            System.out.println("¿Cúantos son? (Introduzca -1 para salir del programa)");
            numeroComensales = sc.nextInt();
            
            for (int i = 0; i < mesa.length; i++) {
                if (mesa[i] == 0 && mesaVacia == false) {
                    System.out.println("Por favor, siéntense en la mesa número " + (i+1));
                    mesa[i] += numeroComensales;
                    mesaVacia = true;
                }
            }
            
            if (mesaVacia == false) {
                for (int i = 0; i < mesa.length; i++) {
                    if (mesa[i] + numeroComensales <= 4 && mesaVacia == false) {
                        System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (i+1));
                        mesa[i] += numeroComensales;
                        mesaVacia = true;
                    }
                }
            }
            
            for (int i = 0; i < mesa.length; i++) {
                System.out.print(mesa[i] +  " ");
            }
            
            mesaVacia = false;
            
        } while (numeroComensales != -1);
    }
}