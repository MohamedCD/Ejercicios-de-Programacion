public class Ejercicio10{
    public static void main(String[] args) {
        
        int [] num = new int[100];
        int [] num2 = new int[100];
        int contador = 0;
        
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 21);
        } 
        
        System.out.println();
        

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                num2[contador] = num[i];
                contador++;
            }
        }
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                num2[contador] = num[i];
                contador++;
            }
        }
        
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
    }
}