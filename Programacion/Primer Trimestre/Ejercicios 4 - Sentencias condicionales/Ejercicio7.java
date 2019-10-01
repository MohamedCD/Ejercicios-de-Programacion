import java.util.*;

public class Ejercicio7{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    float media, nota1, nota2, nota3;
    
    System.out.println("Introduce la primera nota");  
    nota1 = sc.nextFloat();
    
    System.out.println("Introduce la segunda nota");  
    nota2 = sc.nextFloat();
    
    System.out.println("Introduce la tercera nota");  
    nota3 = sc.nextFloat();
    
    media = (nota1 + nota2 + nota3) / 3;
    
    System.out.printf("La media es de: %.2f", media);
  
  }
}
