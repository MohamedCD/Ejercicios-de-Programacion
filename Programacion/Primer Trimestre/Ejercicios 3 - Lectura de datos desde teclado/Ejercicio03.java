import java.util.*;
public class Ejercicio03{
  public static void main(String[] args){
    
  Scanner sc = new Scanner(System.in);  
  
    float euros, pesetas;
    
    System.out.println("Introduce la cantidad de pesetas");
    pesetas = sc.nextFloat();
    
    euros = pesetas * 0.006f;
    
    System.out.println("Son un total de: "+euros+"€"); 
  
  }
}
