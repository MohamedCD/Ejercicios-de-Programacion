/* 
MB, kB, B
Dada una cantidad en Bytes, conviértase a "forma compleja", esxpresando su equivalencia en GB, kB y B.
Ejemplo:

378424 B = ?????????????? MB + ¿¿¿¿¿¿¿ kB + ######## B
*/
import java.util.Scanner;

public class EjercicioClase1{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce la cantidad en Bytes");
    float bytes = sc.nextFloat();
    
    float mB = bytes / 1024 / 1024;
    
    float mbFinal = mB - mB % 1;
    
    float kbInicial = (mB % 1) * 1024;
    
    float kbFinal = kbInicial - kbInicial % 1;
    
    float bytesFinal = (kbInicial % 1) * 1024;
    
    
    System.out.println(bytes + "B = " + mbFinal + " MB + "+ kbFinal + "kB + " + bytesFinal + "B"); 
    
    
  }
}
