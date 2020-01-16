package ejercicio18;

public class Incidencia {
    
    String estado;
    String problema;
    String resolucion;
    static int pendientes;
    static int contadorCodigo = 1;
    int codigo;
    int puesto;
    
    Incidencia(int nPuesto, String nProblema){
        this.puesto = nPuesto;
        this.problema = nProblema;
        this.estado = "Pendiente";
        this.codigo = contadorCodigo++;
        pendientes++;
    }
    
    public static int getPendientes(){
        return pendientes;
    }

    public void resuelve(String resolucion){
        this.estado = "Resuelta";
        this.resolucion = resolucion;
        this.pendientes--;
    }
    
    public String toString(){
        
        if (this.estado.equals("Resuelta")) {
            return "Incidencia " + codigo + " - Puesto: " + this.puesto +" - " + this.problema + " - " + this.estado + " - " + this.resolucion;
        } else {
            return "Incidencia " + codigo + " - Puesto: " + this.puesto +" - " + this.problema + " - " + this.estado;
        }
    }
}
