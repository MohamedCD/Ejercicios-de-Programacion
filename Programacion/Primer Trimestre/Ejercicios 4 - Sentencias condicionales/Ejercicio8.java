import java.util.*;

public class Ejercicio8{
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
    
    if(media < 5){
      System.out.println(" insuficiente");
    }
    else if(media < 6){
      System.out.println(" suficiente");
    }
    else if(media < 7){
      System.out.println(" bien");
    }
    else if(media < 9){
      System.out.println(" notable");
    }
    else{
      System.out.println(" sobresaliente");
    }
  }
}
