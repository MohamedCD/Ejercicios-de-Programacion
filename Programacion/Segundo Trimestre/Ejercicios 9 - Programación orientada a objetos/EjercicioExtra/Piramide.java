public class Piramide {
    
    int altura;
    char caracter;
    
    Piramide(int nAltura, char nCaracter){
        this.altura = nAltura;
        this.caracter = nCaracter;
    }
    
    public void Aumentar(){
        if (this.altura < 12) {
            this.altura++;
        } else {
            System.out.println("La pirámide ya ha alcanzado su altura máxima");
        }
    }
    
    public void Disminuir(){
        if (this.altura > 1) {
            this.altura--;
        } else {
            System.out.println("La pirámide ya ha alcanzado su altura mínima");
        }
    }
    
    public void CambiarCaracter(char otroCaracter){
        this.caracter = otroCaracter;
    }
    
    public String toString(){
        String dibujo = "";
        
        for (int i = 0; i < this.altura + 1; i++) {
            
            for (int j = i; j < this.altura; j++) {
                dibujo += " ";
            }
            
            for (int k = 1; k < i*2; k++) {
                dibujo += this.caracter;
            }
            
            dibujo += "\n";
        }
        
        return dibujo;
    }
}
