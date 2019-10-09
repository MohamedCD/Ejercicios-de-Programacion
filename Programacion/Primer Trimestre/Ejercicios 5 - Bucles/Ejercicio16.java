import java.util.*;

public class Ejercicio16{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num;
        boolean primo = true;

        System.out.println("Introduce un número");
        num = sc.nextInt();

        for (int i = 2; i <= num/2; i++) {
            if (num%i == 0) {
                primo = false;
            }
        }

        if (primo && num != 1) {
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
}
