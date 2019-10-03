import java.util.*;

public class Ejercicio21{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String opcion = "apto";
		float nota1, nota2, notaMedia;

		System.out.println("Introduce la nota del primer control");
		nota1 = sc.nextInt();

		System.out.println("Introduce la nota del segundo control");
		nota2 = sc.nextInt();

		sc.nextLine();

		notaMedia = (nota1 + nota2) / 2;

		if (notaMedia >= 5) {
			System.out.println("Tu nota media es de: " + notaMedia);
		}
		else{
			System.out.println("¿Cuál ha sido el resultado de la recuperación?");
			opcion = sc.nextLine();

			if (opcion.equals("apto")) {
				System.out.println("Tu nota media es de: 5");
			}
			else{
				System.out.println("Tu nota media es de: " + notaMedia);
			}
		}

	}
}