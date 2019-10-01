import java.util.*;

public class Ejercicio6{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    float gravedad = 9.81f, altura, tiempo;
    
    System.out.println("Introduce la altura desde la que caerá el objeto");  
    altura = sc.nextFloat();
    
    tiempo = (float) Math.sqrt((2 * altura) / gravedad);
    
    System.out.printf("El objeto tardará en caer: %.2f %s", tiempo, "s");
  
  }
}
