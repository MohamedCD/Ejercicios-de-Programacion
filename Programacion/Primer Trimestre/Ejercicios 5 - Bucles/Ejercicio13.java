import java.util.*;

public class Ejercicio13{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int contador = 0, positivo = 0, negativo = 0, num;

        do {
            System.out.println("Introduce un número");
            num = sc.nextInt();

            if (num > 0) {
                positivo++;
            }else{
                negativo++;
            }

            contador++;
        } while (contador < 10);

        System.out.println("Hay " + positivo + " números positivos y " + negativo + " números negativos");
    }
}
