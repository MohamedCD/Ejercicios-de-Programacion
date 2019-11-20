import java.util.Scanner;

public class Ejercicio17{
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        
        int [] num = new int[10];
        int [] num2 = new int[10];
        int numIntroducido;
        
        boolean numCorrecto = false;
        
        for (int i = 0; i < num.length; i++) {
            num [i] = (int) (Math.random() * 101);
        }
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] +  " ");
        }
        
        do {            
            
            System.out.println("\nIntroduzca un número");
            numIntroducido = sc.nextInt();
            
            for (int i = 0; i < num.length; i++) {
                if (num[i] == numIntroducido) {
                    numCorrecto = true;
                }
            }
            
        } while (numCorrecto == false);
        
        do {            
            
            num2[0] = num[9];

            for (int i = 0; i < num.length-1; i++) {
                num2[i+1] = num[i];
            }

            for (int i = 0; i < num.length; i++) {
                num[i] = num2[i];
            }    
            
        } while (num[0] != numIntroducido);
        
            
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] +  " ");
            Thread.sleep(1000);
        }
        
    }
}