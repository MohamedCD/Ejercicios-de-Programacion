package ejercicio08;

public class Terminal {
    
    public String numero;
    public int segundos;
    
    Terminal(){
        numero = "sinNumero";
        segundos = 0;
    }
    
    public Terminal(String nNumero){
        this.numero = nNumero;
        this.segundos = 0;
    }
    
    public void llama(Terminal t, int segundos){
        this.segundos += segundos;
        t.segundos += segundos;
    }
    
    public String toString(){
        return "Nº " + numero + " - " + this.segundos + "s de conversación";
    }
}
