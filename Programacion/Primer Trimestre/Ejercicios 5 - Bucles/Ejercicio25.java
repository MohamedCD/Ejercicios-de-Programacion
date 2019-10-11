import java.util.Scanner;

public class Ejercicio25{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num, aux, contador = 1;
       
        System.out.println("Introduce un número");
        num = sc.nextInt();
        
        aux = num;
        
        do {            
            aux = aux / 10;
            contador++;
        } while (aux > 10);
        
        for (int i = 0; i < contador; i++) {
            System.out.print(num%10);
            num = num / 10;
        }    
    }
}