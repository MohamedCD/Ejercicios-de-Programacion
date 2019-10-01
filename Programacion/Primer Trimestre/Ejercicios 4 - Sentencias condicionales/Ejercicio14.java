import java.util.*;

public class Ejercicio14{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		float num;

		System.out.println("Introduce un número");
		num = sc.nextFloat();

		if (num%2 == 0) {
			System.out.println("Es par");
		}
		else{
			System.out.println("Es impar");
		}

		if (num%5 == 0) {
			System.out.println("Es divisible entre 5");
		}
		else{
			System.out.println("No es divisible entre 5");
		}

	}
}