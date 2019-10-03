import java.util.*;

public class Ejercicio19{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Introduce un número entero");
		num = sc.nextInt();

		if (num/10000 >= 1 ) {
			System.out.println("5 digitos");
		}
		else if (num/1000 >=1) {
			System.out.println("4 digitos");
		}
		else if (num/100 >=1) {
			System.out.println("3 digitos");
		}
		else if (num/10 >=1) {
			System.out.println("2 digitos");
		}
		else{
			System.out.println("1 digito");
		}

	}
}