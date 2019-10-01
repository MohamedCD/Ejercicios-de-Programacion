import java.util.*;

public class Ejercicio5{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    float valorA, valorB, valorX;
    
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");  
    System.out.print("Por favor, introduce el valor de a: "); 
    valorA = sc.nextFloat();
    
    System.out.print("Ahora introduzca el valor de b: "); 
    valorB = sc.nextFloat();
    
    if(valorA != 0){
      valorX = -valorB / valorA;
      System.out.println("x = "+valorX);
    }
    else{
      System.out.println("Esa ecuación no tiene solución real");
    }
  }
}
