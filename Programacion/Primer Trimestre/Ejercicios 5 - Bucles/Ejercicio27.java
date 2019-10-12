import java.util.Scanner;

public class Ejercicio27{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num, contador = 0, suma = 0, aux = 0;

        System.out.println("Introduce un número");
        num = sc.nextInt();

        do {

            aux += 3;
            System.out.println(aux);
            contador++;
            suma += aux;

        } while (aux <= num-3);

        System.out.println("Hay un total de " + contador + " múlttiplos de 3");
        System.out.println("La suma total es de " + suma);
    }
}
