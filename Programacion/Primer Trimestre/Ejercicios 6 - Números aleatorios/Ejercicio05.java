public class Ejercicio05{
    public static void main(String[] args) {
        
        int num, numMax = 0, numMin = 200, media = 0;
        
        for (int i = 0; i < 50; i++) {
            
            num = (int) (Math.random()*100)+100;
                    
            System.out.print(num + " ");
            
            if (numMax < num) {
                numMax = num;
            }
            
            if (numMin > num) {
                numMin = num;
            }
            
            media += num;
        }
        
        media /= 50;
        
        System.out.println("\nEl número más alto es: " + numMax);
        System.out.println("El número más bajo es: " + numMin);
        System.out.println("La media es: " + media);
    }
}