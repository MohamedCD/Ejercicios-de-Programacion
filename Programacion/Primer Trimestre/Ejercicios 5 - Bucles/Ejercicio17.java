import java.util.*;

public class Ejercicio17{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num, resultado = 0;

        System.out.println("Introduce un número");
        num = sc.nextInt();

        if (num > 0) {
            for (int i = num; i < num+100; i++) {
                resultado += i;
            }
        }

        System.out.println(resultado);

    }
}
