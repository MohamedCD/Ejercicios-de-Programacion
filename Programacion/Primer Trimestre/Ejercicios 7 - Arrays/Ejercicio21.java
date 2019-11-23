public class Ejercicio21{
    public static void main(String[] args) {
        
        int[] num = new int[15];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 501);
            System.out.print(num[i] + " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < num.length; i++) {
            while (num[i] % 5 != 0) {
                num[i]++;
            };
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}