import java.util.Scanner;

public class Ejercicio26{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int anchura, altura, bocadoAltura, bocadoAnchura;
        boolean bocadoMedio = false;
        
        System.out.println("Introduzca la anchura de la tableta: ");
        anchura = sc.nextInt();
        
        System.out.println("Introduzca la altura de la tableta: ");
        altura = sc.nextInt();
        
        bocadoAltura = (int) (Math.random()*altura)+1;
        
        if (bocadoAltura == 1 || bocadoAltura == altura) {
            bocadoAnchura = (int) (Math.random()*anchura)+1;
        }
        else{
            bocadoAnchura = (int) (Math.random()*2)+1;
            bocadoMedio = true;
        }
        
        if (bocadoMedio && bocadoAnchura == 2) {
            bocadoAnchura = anchura;
        }
        
        System.out.println("altura bocao" + bocadoAltura + "anchura bcoado" + bocadoAnchura);

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= anchura; j++) {
                if (i == bocadoAltura && j == bocadoAnchura && bocadoMedio == false) {
                    System.out.print(" ");
                }
                else if(i == bocadoAltura && j == bocadoAnchura && bocadoMedio){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}