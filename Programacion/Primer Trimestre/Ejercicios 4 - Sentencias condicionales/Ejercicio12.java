import java.util.*;

public class Ejercicio12{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String respuesta1, respuesta2, respuesta3, respuesta4, respuesta5, respuesta6, respuesta7, respuesta8, respuesta9, respuesta10;
    int respuestasCorrectas = 0;
    
    System.out.println("¿...?");
    respuesta1 = sc.nextLine();
    
    if(respuesta1.equals("...")){
      respuestasCorrectas++;
    }
    
    System.out.println("Respuestas correctas: " + respuestasCorrectas);
    
    //Para el resto de preguntas seria reciclar código.
  }
}
