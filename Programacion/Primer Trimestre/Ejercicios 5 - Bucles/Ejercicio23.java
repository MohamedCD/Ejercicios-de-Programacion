import java.util.Scanner;

public class Ejercicio23{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int totalAcumulado = 0, num, contadorNum = 0, media;
        
        do {            
            
            System.out.println("Introduce un número");
            num = sc.nextInt();
            
            totalAcumulado += num;
            
            contadorNum++;
            
        } while (totalAcumulado < 10000);
        
        media = totalAcumulado / contadorNum;
        
        System.out.println("Total acumulado " + totalAcumulado);
        System.out.println("Total de números introducidos " + contadorNum);
        System.out.println("Media de los números introducidos " + media);
       
    }
}