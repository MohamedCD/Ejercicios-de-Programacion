import java.util.Scanner;

public class Ejercicio06{
  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce la base: ");
    int base = sc.nextInt();
    
    System.out.println("Introduce la altura: "); 
    int altura  = sc.nextInt();
    
    int area = base * altura / 2;
    
    System.out.println("El area del triángulo es de: " + area);
  }
}
