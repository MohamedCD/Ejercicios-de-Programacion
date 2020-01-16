package ejercicio13;

public class CuentaCorriente {
    
    String numero;
    int saldo;
    
    CuentaCorriente(){
        saldo = 0;
        
        numero = "";
        for (int i = 0; i < 10; i++) {
            numero += (int) (Math.random() * 10);
        }
    }
    
    CuentaCorriente(int nSaldo){
        saldo = nSaldo;
        
        numero = "";
        for (int i = 0; i < 10; i++) {
            numero += (int) (Math.random() * 10);
        }
    }

    public void ingreso(int ingreso) {
        saldo += ingreso;
    }

    public void cargo(int cargo) {
        saldo -= cargo;
    }

    public void transferencia(CuentaCorriente CC, int transferencia) {
        this.cargo(transferencia);
        CC.ingreso(transferencia);
    }
    
    public String toString(){
        return "Número de cta: " + this.numero + "Saldo: " + this.saldo + "€";
    }
    
}
