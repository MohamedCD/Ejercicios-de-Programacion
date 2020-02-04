package carrito;

import java.util.ArrayList;

public class Carrito {
    
    ArrayList <Elemento> productos = new ArrayList <Elemento> ();
    
    public void agrega(Elemento e){
        boolean encontontrado = false;
        
        for (Elemento e2 : productos) {
            if (e2.getProducto().equals(e.getProducto())) {
                e2.setCantidad(e2.getCantidad() + e.getCantidad());
                encontontrado = true;
            }
        }
        
        if (!encontontrado) {
            productos.add(e);
        }
        
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
