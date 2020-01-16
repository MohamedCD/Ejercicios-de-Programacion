package ejercicio17;

public class Piramide {
    
    int altura;
    static int numeroPiramides;
    
    Piramide(int nAltura){
        this.altura = nAltura;
        this.numeroPiramides++;
    }
     
    public static int getPiramidesCreadas(){
        return numeroPiramides;
    }
    
    public String toString(){
        String dibujo = "";
        
        for (int i = 0; i < this.altura + 1; i++) {
            
            for (int j = i; j < this.altura; j++) {
                dibujo += " ";
            }
            
            for (int k = 1; k < i*2; k++) {
                dibujo += "*";
            }
            
            dibujo += "\n";
        }
        
        return dibujo;
    }
}
