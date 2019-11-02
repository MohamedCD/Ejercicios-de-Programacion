public class Ejercicio19{
    public static void main(String[] args) {

        int num, parMaximo = 0, imparMinimo = 200, media = 0;
        
        for (int i = 0; i < 50; i++) {
            num = (int) (Math.random()*301)-100;
            
            System.out.print(num + " ");
            
            if (num % 2 == 0) {
                if (parMaximo < num) {
                    parMaximo = num;
                }
            }
            
            if (num % 2 != 0) {
                if (imparMinimo > num) {
                    imparMinimo = num;
                }
            }  
            
            media += num;
        }
        
        media /= 50;
        
        System.out.println("\nMáximo de los pares --> " + parMaximo);
        System.out.println("Mínimo de los impares --> " + imparMinimo);
        System.out.println("Media --> " + media);
    }
}