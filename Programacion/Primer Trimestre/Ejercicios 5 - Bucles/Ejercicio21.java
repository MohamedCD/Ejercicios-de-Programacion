import java.util.Scanner;

public class Ejercicio21{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num, contadorNum = 0, mediaPar = 0, mediaImpar = 0, contadorNumPar = 0, contadorNumImpar = 0;
        boolean numPositivo = true;
       
        do {        
            
            System.out.println("Introduce un número");
            num = sc.nextInt();
            
            if (num > 0) {
                if (num%2 == 0) {
                    mediaPar += num;
                    contadorNumPar++;
                }
                else{
                    mediaImpar += num;
                    contadorNumImpar++;
                }
                contadorNum++;
            }
            else{
                numPositivo = false;
            }
            
        } while (numPositivo);
        
        mediaPar = mediaPar / contadorNumPar;
        mediaImpar = mediaImpar / contadorNumImpar;
      
        System.out.println("Se han introducido " + contadorNum + " números");
        System.out.println("La media de los números pares es de " + mediaPar);
        System.out.println("La media de los números impares es de " + mediaImpar);
        
    }
}