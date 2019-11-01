public class Ejercicio12{
    public static void main(String[] args) {
        
        char num;
        
        for (int i = 0; i < 10000; i++) {
            num = (char) (Math.random()* (126 - 32 + 1) + 32);
            
            System.out.print(num);
            
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}