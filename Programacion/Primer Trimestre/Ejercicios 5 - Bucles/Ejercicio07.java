import java.util.Scanner;

public class Ejercicio07{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int numSecreto = 1234, numIntroducido, contador = 0;
        boolean numAcertado = false;
        
        do {            
            System.out.println("Introduce la combinación de la caja fuerte");
            numIntroducido = sc.nextInt();
            
            if (numIntroducido == numSecreto) {
                numAcertado = true;
            }else{
                System.out.println("Lo siento, esa no es la combinación");
            }
            
            contador++;
        } while (contador < 4 && numAcertado == false);
        
        if (numAcertado) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        }
    }
}