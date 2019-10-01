public class Ejercicio1 {
  public static void main(String[] args){
  
    int x=144, y=999, suma, resta, multiplicacion;
    float division;
    
    suma = x+y;
    resta = x-y;
    multiplicacion = x*y;
    division = (float) x/y;
    
    System.out.println("Los números son: "+x+" y "+y);
    System.out.println("La suma es: "+suma);
    System.out.println("La resta es: "+resta);
    System.out.println("La multiplicación es: "+multiplicacion);
    System.out.printf("La división es %.6f: ", division);
  
  }
}
