import java.util.*;

public class Ejercicio15{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int base, exponente;

        System.out.println("Introduce la base");
        base = sc.nextInt();

        System.out.println("Introduce el exponente");
        exponente = sc.nextInt();

        for (int i = 1; i <= exponente; i++) {
            System.out.println(base + "^" + i);
        }
    }
}
