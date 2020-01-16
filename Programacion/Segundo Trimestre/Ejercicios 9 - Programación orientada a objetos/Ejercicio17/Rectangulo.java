package ejercicio17;

public class Rectangulo {
    
    int base;
    int altura;
    static int numeroRectangulos;
    
    Rectangulo(int nBase, int nAltura){
        this.base = nBase;
        this.altura = nAltura;
        this.numeroRectangulos++;
    }
    
    public static int getRectangulosCreados(){
        return numeroRectangulos;
    }
    
    public String toString(){
        String dibujo = "";
        
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                dibujo += "*";
            }
            dibujo += "\n";
        }
        
        return dibujo;
    }
}
