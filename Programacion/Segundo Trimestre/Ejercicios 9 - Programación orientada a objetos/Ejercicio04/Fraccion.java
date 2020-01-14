package ejercicio04;

public class Fraccion {
    
    int numerador;
    int denominador;
    
    Fraccion(){
        numerador = 0;
        denominador = 0;
    }
    
    Fraccion(int nNumerador, int nDenominador){
        this.numerador = nNumerador;
        this.denominador = nDenominador;
    }
    
    public void invierte(){
        int aux1 = this.numerador;
        int aux2 = this.denominador;
        
        this.numerador = aux2;
        this.denominador = aux1;
    }
    
    public void simplifica(){
        for (int i = 0; i < Math.min(this.numerador, this.denominador); i++) {
            if ((this.numerador % i == 0) && (this.denominador % i == 0)) {
                while(this.numerador >= i && this.denominador >= i){
                    this.numerador /= i;
                    this.denominador /= i;
                }
            }
        }
    }
    
    public int multiplica(int num){
        int resultado;
        
        resultado = (this.numerador / this.denominador) * num;
        
        return resultado;
    }
    
    public int divide(int num){
        int resultado;
        
        resultado = (this.numerador / this.denominador) / num;
        
        return resultado;
    }
}
