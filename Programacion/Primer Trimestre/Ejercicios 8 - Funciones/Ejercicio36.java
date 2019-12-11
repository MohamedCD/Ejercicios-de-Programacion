package funciones;

public class Ejercicio36{
    
    public static int[] filtraPrimos(int array[]){
        int [] aux = new int [array.length];
        int contador = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (funciones.Funciones.esPrimo(array[i])) {
                aux[contador++] = array[i];
            }
        }
        
        if (contador > 0) {
            int [] arrayPrimos = new int [contador];
        
            for (int i = 0; i < arrayPrimos.length; i++) {
                arrayPrimos[i] = aux[i];
            }
            
            return arrayPrimos;
            
        } else {
            int [] arrayPrimos = {-1};
            return arrayPrimos;
        }   
    }

}