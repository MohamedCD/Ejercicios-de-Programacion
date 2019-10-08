import java.util.Scanner;

public class Ejercicio08{
  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce las horas trabajadas a la semana: ");
    int horas = sc.nextInt();
    
    int pagoHora = 12;
    
    int pagaSemanal = horas * pagoHora;
    
    System.out.println("El trabajador ganará: " + pagaSemanal +"€ a la semana");
  }
}
