import java.util.*;

public class Ejercicio11{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num, numCuadrado, numCubo;

        System.out.println("Introduce un número");
        num = sc.nextInt();

        for (int i = num; i < num + 5; i++) {
            numCuadrado = (int) Math.pow(i, 2);
            numCubo = (int) Math.pow(i, 3);
            System.out.printf("%-10s %5s %10s\n", i, numCuadrado, numCubo);
        }
    }
}
