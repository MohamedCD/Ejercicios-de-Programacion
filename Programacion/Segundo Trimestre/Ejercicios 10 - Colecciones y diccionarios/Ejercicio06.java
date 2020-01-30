import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        HashMap <String, String> acceso = new HashMap <String, String>();
        
        String usuario, contraseña;
        boolean accedido = false;
        
        acceso.put("admin", "1234");
        acceso.put("administrador", "admin");
        acceso.put("admin1", "admin1234");
        acceso.put("admin123", "1234admin");
        acceso.put("1234", "1234");
        
        for (int i = 0; i < 3 && accedido == false; i++) {
            System.out.println("Introduce usuario y contraseña");
            usuario = sc.nextLine();
            contraseña = sc.nextLine();
            
            if (acceso.containsKey(usuario)) {
                if (acceso.get(usuario).equals(contraseña)) {
                    System.out.println("Ha accedido al area restringida");
                    accedido = true;
                } else {
                    System.out.println("Contraseña incorrecta");
                }
            }
        }
        
        if (!accedido) {
            System.out.println("Lo siento, no puedes pasar");
        }
    }    
}