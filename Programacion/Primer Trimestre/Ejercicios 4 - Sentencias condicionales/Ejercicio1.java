import java.util.*;
public class Ejercicio1{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce un día de la semana");
    String diaSemana = sc.nextLine();
    
    switch(diaSemana){
      
    case "lunes": System.out.println("Sistemas Informáticos"); break;
    case "martes": System.out.println("Programación"); break;
    case "miercoles": System.out.println("Programación"); break;  
    case "jueves": System.out.println("Programación"); break;  
    case "viernes": System.out.println("Fol"); break;  
    default: System.out.println("Ha introducido mal el día"); break;
    
    }
  }
}
