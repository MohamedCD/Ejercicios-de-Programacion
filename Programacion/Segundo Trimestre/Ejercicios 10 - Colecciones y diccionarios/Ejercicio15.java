import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio15 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        HashMap <String, Double> producto = new HashMap <String, Double> ();
        ArrayList <String> prodComp = new ArrayList <String> ();
        ArrayList <Integer> prodCompCant = new ArrayList <Integer> ();
        
        String opcion, descuento;
        int cantidad;
        double precioTotal = 0, descuentoTotal = 0;
        
        producto.put("avena", 2.21);
        producto.put("garbanzos", 2.39);
        producto.put("tomate", 1.59);
        producto.put("jengibre", 3.13);
        producto.put("quinoa", 4.50);
        producto.put("guisantes", 1.60);
        
        do {            
            
            System.out.print("Producto: ");
            opcion = sc.nextLine();
            
            if (!opcion.equals("fin")) {
                System.out.print("Cantidad: ");
                cantidad = sc.nextInt();
                
                precioTotal += producto.get(opcion) * cantidad;
                
                            
                if (prodComp.contains(opcion)) {
                    cantidad += prodCompCant.get(prodComp.indexOf(opcion));
                    prodCompCant.set(prodComp.indexOf(opcion), cantidad);
                } else {
                    prodComp.add(opcion);
                    prodCompCant.add(cantidad);
                }
                
                sc.nextLine();
            }
            
        } while (!opcion.equals("fin"));
        
        System.out.println("Introduce código de descuento (ECODTO)");
        descuento = sc.nextLine();
        
        if (descuento.equals("ECODTO")) {
            descuentoTotal = precioTotal * 0.1;
            precioTotal -= descuentoTotal;
        }
        
        System.out.println("Producto Precio Cantidad Subtotal");
        System.out.println("---------------------------------");
        
        for (int i = 0; i < prodComp.size(); i++) {
            System.out.println(prodComp.get(i) + "  " + producto.get(prodComp.get(i)) + "\t" + prodCompCant.get(i) + "\t" + (producto.get(prodComp.get(i)) * prodCompCant.get(i)));
        }
        
        System.out.println("---------------------------------");
        System.out.println("Descuento: " + descuentoTotal);
        System.out.println("---------------------------------");
        System.out.println("TOTAL: " + precioTotal);
    
    }
}


