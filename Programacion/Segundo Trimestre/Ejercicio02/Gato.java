package ejercicio02;

public class Gato {
    
    private String nombre;
    private String color;
    private String raza;
    
    Gato(String nNombre, String nColor, String nRaza){
        this.nombre = nNombre;
        this.color = nColor;
        this.raza = nRaza;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getRaza() {
        return raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}