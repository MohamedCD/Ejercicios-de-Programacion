public class Ejercicio25{
    public static void main(String[] args) {
        
        int num;
        boolean primo = true;
        
        for (int i = 0; i < 100; i++) {
            num = (int) (Math.random() * (200 - 10 + 1)) + 10;
            for (int j = 2; j < num/2; j++) {
                if (num%j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.print("#" + num + "# ");
            }
            else if(num % 5 == 0){
                System.out.print("[" + num + "] ");
            }
            else{
                System.out.print(num + " ");
            }
            primo = true;
        }
    }
}