public class Ejercicio6 {
  public static void main(String[] args){
  
    float base, factura, IVA;
    
    base = 200.75f;
    
    IVA = 0.21f;
    
    factura = base + base * IVA;
    
    System.out.printf("El total de la factura será de: %.2f%s", factura, "€");
    
  }
}
