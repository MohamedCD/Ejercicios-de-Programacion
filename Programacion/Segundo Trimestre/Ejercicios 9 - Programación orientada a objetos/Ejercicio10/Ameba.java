package ejercicio10;

public class Ameba {
    
    int peso;
    
    Ameba(){
        peso = 3;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setPeso(int nPeso){
        this.peso = nPeso;
    }
    
    public void come(int comida){
        this.peso += comida - 1;
    }

    public void come(Ameba a){
        this.peso += a.getPeso() - 1;
        a.setPeso(0);
    }
    
    public String toString(){
        return "Soy una ameba y peso " + this.peso + " microgramos.";
    }
    
}
