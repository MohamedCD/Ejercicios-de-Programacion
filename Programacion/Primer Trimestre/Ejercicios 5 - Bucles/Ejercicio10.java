import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int numIntroducido, aux = 0, contador = 0;
        float media;
        boolean valorCorrecto = true;
        
        do {          
            
            System.out.println("Introduce un número");
            numIntroducido = sc.nextInt();
            
            if(numIntroducido > 0){
                aux += numIntroducido;
                contador++;
            }
            else{
                valorCorrecto = false;
            }
            
        } while (valorCorrecto);
        
        media = aux / contador;
        
        System.out.println("La media será: " + media);
    }
}