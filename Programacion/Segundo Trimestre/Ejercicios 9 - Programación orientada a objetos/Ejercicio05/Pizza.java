package ejercicio05;

public class Pizza {
    
    String tamaño;
    String tipo;
    String estado;
    static int pedidas;
    static int servidas;
    
    Pizza(){
        tamaño = "";
        tipo = "";
        estado = "";
        pedidas = 0;
        servidas = 0;
    }
    
    Pizza(String nTipo, String nTamaño){
        this.tipo = nTipo;
        this.tamaño = nTamaño;
        this.estado = "pedida";
        this.pedidas++;
    }
    
    public void sirve(){
        if (!this.estado.equals("servida")) {
            this.estado = "servida";
            this.servidas++;
        } else {
            System.out.println("Esta pizza ya ha sido servida");
        }   
    }
    
    public static int getTotalPedidas(){
        return pedidas;
    }
    
    public static int getTotalServidas(){
        return servidas;
    }
    
    public String toString(){
        return "pizza " + this.tipo + " " + this.tamaño + ", " + this.estado;
    }
            
    
    
}
