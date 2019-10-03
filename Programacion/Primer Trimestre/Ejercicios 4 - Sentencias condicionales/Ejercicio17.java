import java.util.*;

public class Ejercicio17{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num, ultimoDigito;

		System.out.println("Introduce un número entero");
		num = sc.nextInt();

		ultimoDigito = num%10;

		System.out.println(ultimoDigito);

	}
}