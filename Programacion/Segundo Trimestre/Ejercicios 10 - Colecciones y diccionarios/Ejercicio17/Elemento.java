package carrito;

public class Elemento {
    private String producto;
    private double precio;
    private int cantidad;
    
    Elemento(String nProducto, double nPrecio, int nCantidad){
        this.producto = nProducto;
        this.precio = nPrecio;
        this.cantidad = nCantidad;
    }
    
    public String getProducto() {
        return producto;
    }
    
    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return this.producto + " PVP: " + String.format("%.2f", this.precio) + " Unidades: " + this.cantidad + " Subtotal: " + String.format("%.2f", this.precio * this.cantidad);
    }
  
}

