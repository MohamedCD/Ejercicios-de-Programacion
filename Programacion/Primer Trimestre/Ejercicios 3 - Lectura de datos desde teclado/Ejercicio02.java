import java.util.*;
public class Ejercicio02{
  public static void main(String[] args){
    
  Scanner sc = new Scanner(System.in);  
  
    float euros, pesetas;
    
    System.out.println("Introduce la cantidad de euros");
    euros = sc.nextFloat();
    
    pesetas = euros * 166.386f;
    
    System.out.println("Son un total de: "+pesetas+" pesetas"); 
  
  }
}
