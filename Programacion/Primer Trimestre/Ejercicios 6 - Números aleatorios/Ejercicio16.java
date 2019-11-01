import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num, tirada1 = 0, tirada2 = 0, tirada3 = 0;


        for (int i = 1; i <= 3; i++) {
            num = (int) (Math.random() * 5) + 1;
            
            switch(num){
                case 1:
                    System.out.print("corazón ");
                break;
                
                case 2:
                    System.out.print("diamante ");
                break;
                
                case 3:
                    System.out.print("herradura ");
                break;
                
                case 4:
                    System.out.print("campana ");
                break;
                
                case 5:
                    System.out.print("limón ");
                break;
            }
            
            switch (i) {
                case 1:
                    tirada1 = num;
                break;
                
                case 2:
                    tirada2 = num;
                break;
                
                case 3:
                    tirada3 = num;
                break;
            }
        }
        
        System.out.println();
        
        if (tirada1 == tirada2 && tirada1 == tirada3) {
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        }
        else if(tirada1 == tirada2 || tirada1 == tirada3 || tirada2 == tirada3){
            System.out.println("Bien, ha recuperado su moneda");
        }
        else{
            System.out.println("Lo siento, ha perdido");
        }
    }
}