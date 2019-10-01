import java.util.Scanner;

public class Ejercicio10{
  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce los MB: ");
    float mb = sc.nextFloat();
    
    float kb = mb * 1024f;
    
    System.out.printf("%s %s %.2f %s", mb, "Mb son: ", kb, "Kb");
  }
}
