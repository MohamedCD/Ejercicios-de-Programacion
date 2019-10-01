import java.util.*;

public class Ejercicio2{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce una hora por teclado");  
    int hora = sc.nextInt();
    
    if(hora >= 6 && hora <= 12){
      System.out.println("Buenos días");
    }
    else if(hora >= 13 && hora <= 20){
      System.out.println("Buenas tardes");
    }
    else{
      System.out.println("Buenas noches");
    }
  }
}
