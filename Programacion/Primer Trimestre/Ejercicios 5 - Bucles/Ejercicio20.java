import java.util.Scanner;

public class Ejercicio20{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        String espacio = " ";
        char caracter;
        int altura;
       
        System.out.println("Introduce la altura de la pirámide");
        altura = sc.nextInt();
        
        System.out.println("Introduce el carácter");
        caracter = sc.next().charAt(0);
        
        for (int i = 0; i < altura-1; i++) {
            
            for (int j = i; j < altura-1; j++) {
                System.out.print(espacio);
            }
            
            System.out.print(caracter);

            for (int j = 1; j < i*2; j++) {
                System.out.print(espacio);
            }
            
            if(i != 0){
                System.out.print(caracter);
            }
            
            

            System.out.println();
            
            if (i == altura-2) {
                for (int l = 1; l < altura*2; l++) {
                    System.out.print(caracter);
                }
            }
        }
        
        System.out.println();
        
    }
}