import java.util.*;

public class Ejercicio11{
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    
    int horaIntroducida, minutosIntroducidos, horasRestantes, minutosRestantes;
    
    System.out.println("Introduce una hora");
    horaIntroducida = sc.nextInt();
    
    System.out.println("Introduce los minutos");
    minutosIntroducidos = sc.nextInt();

    if(minutosIntroducidos > 0 && minutosIntroducidos <= 60){
      minutosRestantes = 60 - minutosIntroducidos;
      horasRestantes = 24 - horaIntroducida - 1;
    }
    else{
      horasRestantes = 24 - horaIntroducida;  
      minutosRestantes = 0;
    }
    
    System.out.println("Para media noche faltan: " + horasRestantes + " horas " + minutosRestantes + " minutos");
  }
}
