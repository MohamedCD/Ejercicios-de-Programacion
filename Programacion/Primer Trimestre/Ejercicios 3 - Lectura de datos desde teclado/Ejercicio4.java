import java.util.*;
public class Ejercicio4 {
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
  
    int num1, num2, suma, resta, multiplicacion;
    float division;
    
    System.out.println("Introduce el primer número");
    num1 = sc.nextInt();
  
    System.out.println("Introduce el segundo número");
    num2 = sc.nextInt();
    
    suma = num1+num2;
    resta = num1-num2;
    multiplicacion = num1*num2;
    division = (float) num1/num2;

    System.out.println("La suma es: "+suma);
    System.out.println("La resta es: "+resta);
    System.out.println("La multiplicación es: "+multiplicacion);
    System.out.printf("La división es %.6f: ", division);
  
  }
}
