import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] num = new int[20];
        int opcion;
        
        for (int i = 0; i < num.length; i++) {
            num [i] = (int) (Math.random() * 401);
        }
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] +  " ");
        }
        
        System.out.println("\n¿Qué números quiere resaltar? (1 - los mútiplos de 5, 2 - los múltiplos de 7): ");
        opcion = sc.nextInt();
        
        if (opcion == 1) {
            for (int i = 0; i < num.length; i++) {
                if (num[i] % 5 == 0) {
                    System.out.print("[" + num[i] + "] ");
                }else{
                    System.out.print(num [i] + " ");
                }
            }
        }else{
            for (int i = 0; i < num.length; i++) {
                if (num[i] % 7 == 0) {
                    System.out.print("[" + num[i] + "] ");
                }else{
                    System.out.print(num [i] + " ");
                }
            }
        }
        
        
        
    }
}