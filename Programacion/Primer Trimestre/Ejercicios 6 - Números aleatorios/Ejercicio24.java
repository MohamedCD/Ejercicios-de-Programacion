import java.util.Scanner;

public class Ejercicio24{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num, azar, longitud = 0, aux, numReves = 0;
     
        System.out.println("Introduzca un número entero positivo");
        num = sc.nextInt();
        
        aux = num;
        
        do {       
            numReves = (numReves * 10) + (aux % 10);
            aux /= 10;
            longitud++;
        } while (aux > 0);
        
        azar = (int) (Math.random()*longitud);
        System.out.println("azar"+azar);
        
        for (int i = 0; i < azar; i++) {
            numReves /= 10;
        }
        
        System.out.println(numReves%10);
    }
}