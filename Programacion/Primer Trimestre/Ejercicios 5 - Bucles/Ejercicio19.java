import java.util.Scanner;

public class Ejercicio19{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        String espacio = " ";
        char caracter;
        int altura;
       
        System.out.println("Introduce la altura de la pirámide");
        altura = sc.nextInt();
        
        System.out.println("Introduce el carácter");
        caracter = sc.next().charAt(0);
        
        for (int i = 0; i < altura; i++) {
            
            for (int j = i; j < altura; j++) {
                System.out.print(espacio);
            }
            
            for (int k = 1; k < i*2; k++) {
                System.out.print(caracter);
            }
            
            System.out.println();
            
        }
    }
}