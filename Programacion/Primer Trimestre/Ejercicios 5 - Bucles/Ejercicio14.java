import java.util.*;

public class Ejercicio14{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int base, exponente, resultado = 1;

        System.out.println("Introduce la base");
        base = sc.nextInt();

        System.out.println("Introduce el exponente");
        exponente = sc.nextInt();

        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base;
        }

        System.out.println(resultado);

    }
}
