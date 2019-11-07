import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] num = new int[10];
        int [] num2 = new int[10];
        int contador = 0;
        boolean primo = true;
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduzca un número");
            num[i] = sc.nextInt();
        } 
        
        System.out.println();
        

        for (int i = 0; i < num.length; i++) {
            for (int j = 2; j < num[i]/2; j++) {
                if (num[i] % j == 0) {
                    primo = false;
                }
            }
            
            if (primo) {
                num2[contador] = num[i];
                contador++;
            }else{
                primo = true;
            }
        }
        
        for (int i = 0; i < num.length; i++) {
            for (int j = 2; j < num[i]/2; j++) {
                if (num[i] % j == 0) {
                    primo = false;
                }
            }
            
            if (primo == false) {
                num2[contador] = num[i];
                contador++;
                primo = true;
            }
            if (num[i] % 2 != 0) {
                
            }
        }
        
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
    }
}