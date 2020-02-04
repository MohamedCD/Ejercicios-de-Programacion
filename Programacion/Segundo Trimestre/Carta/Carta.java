public class Carta implements Comparable<Carta> {
    
    int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    String[] pa = {"bastos", "copas", "espadas", "oros"};
    
    int numero;
    String palo;
    
    Carta() {
        this.numero = num[(int)(Math.random()*12)];
        this.palo = pa[(int)(Math.random()*4)];
    }
    
    public int getNumero() {
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
        
        if (this.numero != ((Carta)c).getNumero()) {
            return false;
        } 
        
        return true;
    }
    
    //Ordenar por palo luego por numero
    /*@Override
    public int compareTo(Carta c) {
        if (palo.equals(c.getPalo())) {
            if(numero > c.getNumero()){
                return 1;
            } else {
                return -1;
            }

        } else {
            return palo.compareTo(c.getPalo());
        }
    }*/
    
    //Ordenar por numero luego por palo
    @Override
    public int compareTo(Carta c) {
        if (numero == c.getNumero()) {
            return palo.compareTo(c.getPalo());
        } else {
            if(numero > c.getNumero()){
                return 1;
            } else {
                return -1;
            }
        }
    }
   
}