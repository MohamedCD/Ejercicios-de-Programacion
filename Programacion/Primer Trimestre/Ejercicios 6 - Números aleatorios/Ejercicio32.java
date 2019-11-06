import java.util.Scanner;

public class Ejercicio32{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int longitud, espacioDelante = 5, senderoDireccion, obstaculo, tipoObstaculo;
        
        System.out.print("Introduzca la longitud del sendero: ");
        longitud = sc.nextInt();
        
        for (int i = 0; i < longitud; i++) {
            
            for (int j = 0; j < espacioDelante; j++) {
                System.out.print(" ");
            }
            
            senderoDireccion = (int) (Math.random() * 3) + 1;
            
            if (senderoDireccion == 1) {
                espacioDelante++;
            }else if(senderoDireccion == 2){
                espacioDelante--;
            }
            
            System.out.print("|");
            
            obstaculo = (int) (Math.random() * 2) + 1;
            tipoObstaculo = (int) (Math.random() * 2) + 1;

            for (int j = 0; j < 4; j++) {
                if (obstaculo == 1) {
                    if (tipoObstaculo == 1) {
                        System.out.print("*");
                    }else{
                        System.out.print("O");
                    }
                }else{
                    System.out.print(" ");
                }
                obstaculo = 2;
            }
            
            System.out.print("|");
            
            System.out.println();
            
        }
    }
}