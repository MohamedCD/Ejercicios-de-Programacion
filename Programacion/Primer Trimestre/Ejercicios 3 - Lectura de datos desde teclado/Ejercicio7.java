import java.util.Scanner;

public class Ejercicio7{
  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce la base imponible: ");
    float base = sc.nextFloat();
    
    float total = base * 1.21f;
    
    System.out.println("El total de la factura es de: " + total);
  }
}
