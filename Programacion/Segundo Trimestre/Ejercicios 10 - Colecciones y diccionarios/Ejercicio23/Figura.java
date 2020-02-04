public class Figura {
    private String nombre;
    private int valor; 
    private int cantidad; 
    
    Figura(String nombre, int valor, int cantidad) {
        this.nombre = nombre;
        this.valor = valor;
        this.cantidad = cantidad;
    }
    
    public boolean esCapturable() {
        return this.cantidad > 0;
    }
    
    public void captura() {
        this.cantidad--;
    }
    
    public int getValor() {
        return valor;
    }
    
    @Override
    public String toString() {
        return nombre + " (" + valor + (valor == 1 ? " peón)" : " peones)");
    }
    
    
}
