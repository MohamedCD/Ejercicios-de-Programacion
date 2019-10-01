public class Ejercicio5 {
  public static void main(String[] args){
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String cian = "\033[36m";
    String blanco = "\033[37m";
    
    
    System.out.println("Lunes  Martes  Miércoles  Jueves  Viernes");
    System.out.println("-----------------------------------------");
    System.out.printf("%s%-4s   %s%s   %5s   %8s   %s%5s\n", rojo,"ED", verde, "PRO", "PRO", "PRO", naranja, "FOL");
    System.out.printf("%s%-4s   %s%s   %5s   %8s   %s%5s\n", azul, "LM", verde, "PRO", "PRO", "PRO", naranja, "FOL");
    System.out.printf("%s%-4s   %s%s   %s%4s   %s%9s   %s%5s\n", azul, "LM", verde, "PRO", rojo, "ED", verde, "PRO", naranja, "FOL");
    System.out.printf("%s%-4s   %s%s   %s%3s   %s%10s   %s%5s\n", morado, "SINF", cian, "BBDD", rojo, "ED", cian, "BBDD", morado, "SINF");
    System.out.printf("%s%-4s   %s%s   %s%3s   %s%10s   %s%5s\n", morado, "SINF", cian, "BBDD", azul, "LM", cian, "BBDD", morado, "SINF");
    System.out.printf("%s%-4s   %s%s   %s%3s   %s%10s   %s%5s%s\n", morado, "SINF", cian, "BBDD", azul, "LM", cian, "BBDD", morado, "SINF", blanco);
    
  }
}
