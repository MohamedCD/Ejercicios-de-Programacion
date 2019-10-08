import java.util.Scanner;

public class Ejercicio09{
  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce la altura del cono: ");
    float altura = sc.nextFloat();
    
    System.out.println("Introduce el radio del cono: "); 
    float radio  = sc.nextFloat();
    
    float volumen = 1/3f * altura * (float) Math.pow(radio, 2) * (float) Math.PI;
    
    System.out.println("El volúmen del cono es de: " + volumen);
  }
}
