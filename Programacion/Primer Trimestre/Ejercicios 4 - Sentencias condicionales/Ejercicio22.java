import java.util.*;

public class Ejercicio22{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dia, hora, minutos, diasRestantes, horasRestantes, minutosRestantesHora, minutosRestantes;

		System.out.println("Introduce un día de la semana");
		dia = sc.nextInt();

		System.out.println("Introduce la hora");
		hora = sc.nextInt();

		System.out.println("Introduce los minutos");
		minutos = sc.nextInt();

		diasRestantes = 5 - dia - 1;

		if (diasRestantes < 0) {
			diasRestantes = 0;
		}

		minutosRestantesHora = 60 - minutos;

		horasRestantes = 24 - hora + 15 - 1;

		minutosRestantes = minutosRestantesHora + horasRestantes * 60 + diasRestantes * 24 * 60;

		System.out.println(minutosRestantes);
	}
}