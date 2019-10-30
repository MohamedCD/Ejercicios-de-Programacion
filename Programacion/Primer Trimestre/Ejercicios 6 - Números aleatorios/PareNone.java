import java.util.Scanner;

public class PareNone{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int eleccion = (int) (Math.random()*2)+1;
        
        String pareNone = "", ganador = "";
        
        if (eleccion == 1) {
            pareNone = "none";
        }else{
            pareNone = "pare";
        }

        
        int num1 = (int) (Math.random()*11);
        int num2;
        int suma;
        
        System.out.println("Introduce un número entre el 0 y el 10");
        num2 = sc.nextInt();
        
        
        System.out.println("La maquina ha elegido el numero " + num1);
        System.out.println("La maquina ha elegido " + pareNone);
        
        suma = num1 + num2;
        
        if (suma%2 == 0) {
            ganador = "pare";
        }else{
            ganador = "none";
        }
        
        if (pareNone.equals(ganador)) {
            System.out.println("El ganador ha sido la maquina");
        }
        else{
            System.out.println("Has sido el ganador");
        }
    }
}