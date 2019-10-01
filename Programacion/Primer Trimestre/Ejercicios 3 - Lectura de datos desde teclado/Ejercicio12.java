import java.util.Scanner;

public class Ejercicio12{
  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce la nota del primer examen: ");
    float notaPrimerExamen = sc.nextFloat();
    
    System.out.println("¿Qué nota quieres saar en el trimestre?");
    float notaTrimestre = sc.nextFloat();
    
    float notaNecesaria = (notaTrimestre - notaPrimerExamen * 0.4f) / 0.6f; 
    
    System.out.printf("Para tener un %s %s %.2f %s", notaTrimestre ," en el trimestre necesitas sacar un ", notaNecesaria, " en el segundo examen");
  }
}
