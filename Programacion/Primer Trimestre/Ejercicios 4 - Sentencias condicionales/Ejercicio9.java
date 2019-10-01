import java.util.*;

public class Ejercicio9{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    float valorA, valorB, valorC, valorX1, valorX2;
    
    System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax² + b = 0");  
    System.out.print("Por favor, introduce el valor de a: "); 
    valorA = sc.nextFloat();
    
    System.out.print("Ahora introduzca el valor de b: "); 
    valorB = sc.nextFloat();
    
    System.out.print("Por último, introduzca el valor de c: "); 
    valorC = sc.nextFloat();
    
    //x = (-b +- raiz b² - 4ac) / 2a 
    
    valorX1 = (-valorB + (float) Math.sqrt((float) Math.pow(valorB, 2) - 4f * valorA * valorC)) / (2 * valorA);
    
    valorX2 = (-valorB - (float) Math.sqrt((float) Math.pow(valorB, 2) - 4f * valorA * valorC)) / (2 * valorA);
  
    System.out.printf("Las soluciones de la ecuación son: \nx1 = %.2f %s %.2f", valorX1, " x2 = ", valorX2);
  }
}
