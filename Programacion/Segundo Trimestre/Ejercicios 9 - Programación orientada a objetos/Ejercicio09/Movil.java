package Ejercicio09;

import ejercicio08.Terminal;
import java.text.DecimalFormat;

public class Movil extends Terminal{
    
    String tarifa = "";
    float precioTotal;

    Movil(String numero, String nTarifa){
        super(numero);
        this.tarifa = nTarifa;
        this.precioTotal = 0;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public int getSegundos(){
        return this.segundos;
    }
    
    public void llama(Movil m, int segundos){
        super.llama(m, segundos);
        
        float minutos = (float) segundos / 60;
        
        switch (this.tarifa) {
            case "rata":
                this.precioTotal += minutos * 0.06;
            break;
            
            case "mono":
                this.precioTotal += minutos * 0.12;
            break;
            
            case "bisonte":
                this.precioTotal += minutos * 0.30;
            break;
        }
    }
    
    public String toString(){
        DecimalFormat formatoEuros = new DecimalFormat("0.00");

        return "Nº " + this.getNumero() + " - " + this.getSegundos() + "s de conversación - tarificados " + formatoEuros.format(this.precioTotal) + " euros";
    }
}
