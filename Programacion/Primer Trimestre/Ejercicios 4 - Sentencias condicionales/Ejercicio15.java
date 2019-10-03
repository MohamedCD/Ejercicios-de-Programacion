import java.util.*;

public class Ejercicio15{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int opcionPiramide;
		char caracter;

		System.out.println("Introduce un carácter");
		caracter = sc.next().charAt(0);

		System.out.println("Elige una opción");
		System.out.println("----------------");
		System.out.println("1. Vértice apuntando hacia arriba");
		System.out.println("2. Vértice apuntando hacia abajo");
		System.out.println("3. Vértice apuntando hacia la derecha");
		System.out.println("4. Vértice apuntando hacia la izquierda");
		opcionPiramide = sc.nextInt();

		switch(opcionPiramide){

			case 1: 
				System.out.printf("%6s\n", caracter);
				System.out.printf("%4s %s %s\n", caracter, caracter, caracter);
				System.out.printf("%2s %s %s %s %s\n", caracter, caracter, caracter, caracter, caracter);
			break;

			case 2: 
				System.out.printf("%2s %s %s %s %s\n", caracter, caracter, caracter, caracter, caracter);
				System.out.printf("%4s %s %s\n", caracter, caracter, caracter);
				System.out.printf("%6s\n", caracter);
			break;

			case 3:
				System.out.printf("%6s\n", caracter); 
				System.out.printf("%4s %s\n", caracter, caracter); 
				System.out.printf("%2s %s %s\n", caracter, caracter, caracter);
				System.out.printf("%4s %s\n", caracter, caracter);
				System.out.printf("%6s\n", caracter);
			break;

			case 4:
				System.out.printf("%s\n", caracter); 
				System.out.printf("%s %s\n", caracter, caracter); 
				System.out.printf("%s %s %s\n", caracter, caracter, caracter);
				System.out.printf("%s %s\n", caracter, caracter);
				System.out.printf("%s\n", caracter);
			break;
		
		}

	}
}