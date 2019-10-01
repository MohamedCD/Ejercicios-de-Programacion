import java.util.*;
public class Ejercicio1{
  public static void main(String[] args){
    
  Scanner sc = new Scanner(System.in);  
  
    int num1, num2, resultado;
    
    System.out.println("Introduce el primer número");
    num1 = sc.nextInt();
  
    System.out.println("Introduce el segundo número");
    num2 = sc.nextInt();
    
    resultado = num1 * num2;
    
    System.out.println("El resultado de la multiplicación es: "+resultado);
  
  }
}
