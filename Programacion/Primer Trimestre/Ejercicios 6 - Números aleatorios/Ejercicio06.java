import java.util.Scanner;

public class Ejercicio06{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = (int) (Math.random()*101);
        int intentos = 5, numIntroducido;
        
        boolean acertado = false;
        
        //System.out.println(num);
        
        do {            
            System.out.println("Adivina el número");
            numIntroducido = sc.nextInt();
            
            intentos--;
            
            if (numIntroducido == num) {
                acertado = true;
                System.out.println("Has acertado");
            }else{
                System.out.println("Quedan " + intentos + " intentos");
                
                if (numIntroducido > num) {
                    System.out.println("El número es menor");
                }else{
                    System.out.println("El número es mayor");
                }
            }
            
        } while (intentos > 0 && acertado == false);
    }
}