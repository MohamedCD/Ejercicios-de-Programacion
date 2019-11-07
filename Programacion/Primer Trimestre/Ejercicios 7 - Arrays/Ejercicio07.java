import java.util.Scanner;

public class Ejercicio07{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] num = new int[100];
        int valor1, valor2;
        
        for (int i = 0; i < num.length; i++) {
            num [i] = (int) (Math.random() * 21);
        } 

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("Introduzca el primer valor");
        valor1 = sc.nextInt();
        
        System.out.println("Introduzca el primer valor");
        valor2 = sc.nextInt();
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] == valor1) {
                System.out.print("\"" + valor2 + "\" ");
            }else{
                System.out.print(num[i] + " ");
            }
        }
    }
}