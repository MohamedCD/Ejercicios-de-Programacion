package ejercicio11;

import java.text.DecimalFormat;

public class TarjetaRegalo {
    
    double saldo;
    String numero;
    
    TarjetaRegalo(double nSaldo){
        this.saldo = nSaldo;
        
        this.numero = "";
        for (int i = 0; i < 5; i++) {
            this.numero += (int) (Math.random() * 10);
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double nuevoSaldo){
        saldo = nuevoSaldo;
    }
    
    public void gasta(double gasto){
        if (saldo - gasto > 0) {
            saldo -= gasto;
        } else {
            System.out.println("No tiene saldo suficiente para gastar " + gasto + "€");
        }
    }
    
    public TarjetaRegalo fusionaCon(TarjetaRegalo tr){
        double nuevoSaldo;
        nuevoSaldo = this.saldo + tr.getSaldo();
        
        this.saldo = 0;
        tr.setSaldo(0);
        
        return new TarjetaRegalo(nuevoSaldo);
    }
    
    public String toString(){
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Tarjeta nº " + this.numero + " - Saldo " + formatoEuros.format(this.saldo) + "€";
    }
}
