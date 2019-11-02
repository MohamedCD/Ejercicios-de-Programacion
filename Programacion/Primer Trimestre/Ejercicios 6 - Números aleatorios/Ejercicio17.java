import java.util.Scanner;

public class Ejercicio17{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int anchura, altura, anchuraPez, alturaPez;
        
        
        System.out.println("Introduzca la anchura (como mínimo 4)");
        anchura = sc.nextInt();
        
        System.out.println("Introduzca la altura (como mínimo 4)");
        altura = sc.nextInt();
        
        anchuraPez = (int) (Math.random() * anchura-2)+3;
        alturaPez = (int) (Math.random() * altura-2)+3;
        
        for (int i = 1; i <= altura; i++) {
            if (i == 1 || i == altura) {
                for (int j = 0; j < anchura; j++) {
                    System.out.print("* ");
                }
            }else{
                System.out.print("*");
                
                for (int j = 0; j < anchura * 2 - 3; j++) {
                    if (i == alturaPez && j == anchuraPez) {
                        System.out.print("&");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        }     
    }
}