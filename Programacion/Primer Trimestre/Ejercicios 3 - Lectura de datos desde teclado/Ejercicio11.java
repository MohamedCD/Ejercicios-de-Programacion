import java.util.Scanner;

public class Ejercicio11{
  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce los Kb: ");
    float kb = sc.nextInt();
    
    float mb = kb / 1024f;
    
    System.out.printf("%s %s %.2f %s", kb, "Kb son: ", mb, "Mb");
  }
}
