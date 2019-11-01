public class Ejercicio15{
    public static void main(String[] args) {
        
        int num, melodia;
        
        do {            
            melodia = (int) (Math.random() * (28 - 4 + 1)) + 4;
        } while (melodia % 4 != 0);

        for (int i = 1; i <= melodia; i++) {
            num = (int) (Math.random() * 7) + 1;
            
            switch(num){
                case 1:
                    System.out.print(" do");
                break;
                
                case 2:
                    System.out.print(" re");
                break;
                
                case 3:
                    System.out.print(" mi");
                break;
                
                case 4:
                    System.out.print(" fa");
                break;
                
                case 5:
                    System.out.print(" sol");
                break;
                
                case 6:
                    System.out.print(" la");
                break;
                
                case 7:
                    System.out.print(" si");
                break;
            }
            if (i % 4 == 0) {
                System.out.print(" |");
            }
        }
        
        System.out.print("|");
    
    }
}