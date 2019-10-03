import java.util.Scanner;

public class Ejercicio18{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, primerDigito, numDig;

		System.out.println("Introduce un número entero");
		num = sc.nextInt();
                
        numDig = String.valueOf(num).length();

		primerDigito = num / (int) Math.pow(10, numDig-1);

		System.out.println(primerDigito);
	}
}