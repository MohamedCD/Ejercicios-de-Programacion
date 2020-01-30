public class Ejercicio01 {
    public static void main(String[] args) {
      
        ArrayList <String> nombres = new ArrayList <String>();
        
        nombres.add("Pepito");
        nombres.add("Manolo");
        nombres.add("Pedro");
        nombres.add("Antonio");
        nombres.add("Jaime");
        
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        } 
    }    
}