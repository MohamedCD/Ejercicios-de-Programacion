import java.util.*;

public class Ejercicio12{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num, aux1 = 0, aux2 = 1, fibonacci;

        System.out.println("Introduce un número");
        num = sc.nextInt();

        System.out.println(aux1 + "\n" + aux2);

        for (int i = 0; i < num-2; i++) {

            fibonacci = aux1 + aux2;

            aux1 = aux2;
            aux2 = fibonacci;

            System.out.println(fibonacci);
        }
    }
}
