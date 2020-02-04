package carrito;

import java.util.ArrayList;

public class Carrito {
    
    ArrayList <Elemento> productos = new ArrayList <Elemento> ();
    
    public void agrega(Elemento e){
        productos.add(e);
    }
    
    public int numeroDeElementos(){
        return productos.size();
    }
    
    public double importeTotal(){
        double total = 0;
        
        for (Elemento e : productos) {
            total += e.getPrecio() * e.getCantidad();
        }

        return total;
    }
    
    public String toString() {
        String pinta = "Contenido del carrito\n=====================\n";
        
        for (Elemento e : productos) {
            pinta += e + "\n";
        }
        
        return pinta;
    }
    
    
}
