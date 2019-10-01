import java.util.*;

public class Ejercicio10{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String mes;
    int dia;
    
    System.out.println("Introduce dia de nacimiento");
    dia = sc.nextInt();
    
    sc.nextLine();
    
    System.out.println("Introduce mes de nacimiento");
    mes = sc.nextLine();
    
    
    
    
    
    switch(mes){
      
      case "enero":
      
        if(dia>=21){
          System.out.println("Acuario");
        }
        else{
          System.out.println("Capricornio");
        }
      
      break;
      
      case "febrero": 
      
        if(dia>=20){
          System.out.println("Piscis");
        }
        else{
          System.out.println("Acuario");
        }
      
      break;
            
      case "marzo": 
      
        if(dia>=21){
          System.out.println("Aries");
        }
        else{
          System.out.println("Piscis");
        }
      
      break;
      
      case "abril": 
      
        if(dia>=21){
          System.out.println("Tauro");
        }
        else{
          System.out.println("Aries");
        }
      
      break;
      
      case "mayo": 
      
        if(dia>=20){
          System.out.println("Géminis");
        }
        else{
          System.out.println("Tauro");
        }
      
      break;
      
      case "junio": 
      
        if(dia>=22){
          System.out.println("Cáncer");
        }
        else{
          System.out.println("Géminis");
        }
      
      break;
      
      case "julio": 
      
        if(dia>=22){
          System.out.println("Leo");
        }
        else{
          System.out.println("Cáncer");
        }
      
      break;
      
      case "agosto": 
      
        if(dia>=24){
          System.out.println("Virgo");
        }
        else{
          System.out.println("Leo");
        }
      
      break;
      
      case "septiembre": 
      
        if(dia>=23){
          System.out.println("Libra");
        }
        else{
          System.out.println("Virgo");
        }
      
      break;
      
      case "octubre": 
      
        if(dia>=22){
          System.out.println("Escorpio");
        }
        else{
          System.out.println("Libra");
        }
      
      break;                                                
    
      case "noviembre": 
      
        if(dia>=23){
          System.out.println("Sagitario");
        }
        else{
          System.out.println("Escorpio");
        }
      
      break;
      
      case "diciembre ": 
      
        if(dia>=22){
          System.out.println("Capricornio");
        }
        else{
          System.out.println("Sagitario");
        }
      
      break;         
      
      default: System.out.println("Has introducido mal el mes");
    }
    
    
    
  }
}
