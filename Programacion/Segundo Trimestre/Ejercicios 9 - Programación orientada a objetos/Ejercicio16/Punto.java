package ejercicio16;

public class Punto {
   
    double coordenadaX;
    double coordenadaY;
    
    Punto(double nCoordenadaX, double nCoordenadaY){
        this.coordenadaX = nCoordenadaX;
        this.coordenadaY = nCoordenadaY;
    }
    
    public String toString() {
        return "(" + this.coordenadaX + ", " + this.coordenadaY + ")";
    }

}
