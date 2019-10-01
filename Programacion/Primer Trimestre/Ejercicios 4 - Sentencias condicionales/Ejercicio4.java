import java.util.Scanner;

public class Ejercicio4{
  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    
    int horasExtra = 0, horas, pagoHora, pagoHoraExtra, pagaSemanal;
    
    System.out.println("Introduce las horas trabajadas a la semana: ");
    horas = sc.nextInt();
    
    pagoHora = 12;
    pagoHoraExtra = 16;
    
    if(horas > 40){
      horasExtra = horas - 40;
      horas = 40;
    }
    
    pagaSemanal = horas * pagoHora + horasExtra * pagoHoraExtra;
    
    System.out.println("El trabajador ganará: " + pagaSemanal +"€ a la semana");
  }
}
