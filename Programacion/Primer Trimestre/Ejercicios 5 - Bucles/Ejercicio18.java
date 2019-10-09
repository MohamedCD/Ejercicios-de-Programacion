import java.util.*;

public class Ejercicio18{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num1, num2, contador = 0, aux = 0;

        System.out.println("Introduce un número");
        num1 = sc.nextInt();

        System.out.println("Introduce un número");
        num2 = sc.nextInt();

        aux = num1;

        do {

            aux = aux + 7;

            System.out.println(aux);

        } while (aux < num2 - 7);

    }
}
