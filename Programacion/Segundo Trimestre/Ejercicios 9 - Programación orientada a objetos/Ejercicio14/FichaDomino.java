package ejercicio14;

public class FichaDomino {
    
    int numero1;
    int numero2;
    
    FichaDomino(int nNumero1, int nNumero2){
        this.numero1 = nNumero1;
        this.numero2 = nNumero2;
    }
    
    public String voltea(){
        int aux = this.numero1;
        
        this.numero1 = this.numero2;
        this.numero2 = aux;
        
        return toString();
    }
    
    public boolean encaja(FichaDomino FD){
        if (this.numero1 == FD.numero1 || this.numero1 == FD.numero2 || this.numero2 == FD.numero1 || this.numero2 == FD.numero2) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "[" + this.numero1 + "|" + this.numero2 + "]";
    }
}
