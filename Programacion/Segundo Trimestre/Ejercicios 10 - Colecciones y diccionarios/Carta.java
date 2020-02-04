package ejercicio08;

public class Carta implements Comparable<Carta> {
    
    String[] num = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    String[] pa = {"bastos", "copas", "espadas", "oros"};
    
    String numero;
    String palo;
    
    Carta() {
        this.numero = num[(int)(Math.random()*10)];
        this.palo = pa[(int)(Math.random()*4)];
    }
    
    public String getNumero() {
        return numero;
    }
    
    public String getPalo() {
        return palo;
    }
    
    @Override
    public String toString() {
        return this.numero + " de " + this.palo;
    }
    
    @Override
    public boolean equals(Object c){
        if (!this.palo.equals(((Carta)c).getPalo())) {
            return false;
        } 
        
        if (!this.numero.equals(((Carta)c).getNumero())) {
            return false;
        } 
        
        return true;
    }
    
    @Override
    public int compareTo(Carta c) {
        if (palo.equals(c.getPalo())) {
            return numero.compareTo(c.getNumero());
        } else {
            return palo.compareTo(c.getPalo());
        }
    }
   
}
