public class Ejercicio22{
    public static void main(String[] args) {
        
        boolean primo = true;
        
        for (int i = 2; i <= 100; i++) {
            
            for (int j = 2; j <= i/2; j++) {
                if (i%j == 0) {
                    primo = false;
                }
            }
            
            if (primo) {
                System.out.println(i);
            }
            else{
                primo = true;
            }
        }
    }
}