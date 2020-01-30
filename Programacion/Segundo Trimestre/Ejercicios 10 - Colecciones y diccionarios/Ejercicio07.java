import java.util.ArrayList;

public class Ejercicio07 {
    public static void main(String[] args) {
        
        String [] arrayMoneda = {"1 céntimo", "2 céntimos", "5 céntimos","10 céntimos", "20 céntimos","50 céntimos", "1 euro","2 euros"};
        String [] posicion = {"cara", "cruz"};
        
        ArrayList <String> moneda = new ArrayList <String>();
        
        int eleccionMoneda = 0, eleccionPosicion = 0, contador = 0, aux1, aux2;

        do {     
            
            aux1 = eleccionMoneda;
            aux2 = eleccionPosicion;
            
            eleccionMoneda = (int) (Math.random() * 8);
            eleccionPosicion = (int) (Math.random() * 2);
            
            if (contador == 0) {
                moneda.add(arrayMoneda[eleccionMoneda] + " - " + posicion[eleccionPosicion]);
                contador++;
            } else if (eleccionMoneda == aux1) { 
                moneda.add(arrayMoneda[eleccionMoneda] + " - " + posicion[eleccionPosicion]);
                contador++;
            } else if (eleccionPosicion == aux2){
                moneda.add(arrayMoneda[eleccionMoneda] + " - " + posicion[eleccionPosicion]);
                contador++;
            }
            
        } while (contador < 6);
        
        for (String moneda1 : moneda) {
            System.out.println(moneda1);
        }
    }    
}
