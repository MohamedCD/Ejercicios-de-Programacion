import java.util.ArrayList;
import java.util.Collections;

public class CartasAleatoriasOrdenadas1 {
     public static void main(String[] args) {

        ArrayList <Carta> cartas = new ArrayList <Carta>();
        
        Carta cartaAux = new Carta();
        
        cartas.add(cartaAux);
        
        int numCartas = (int) (Math.random() * 11) + 9;
        
        for (int i = 0; i < numCartas;) {
            do {                
                cartaAux = new Carta();
            } while ((cartas.contains(cartaAux)));
            
            i++;
            cartas.add(cartaAux);
        }
        
        Collections.sort(cartas);
        
        for(Carta miCarta : cartas){
            System.out.println(miCarta);
        }

    }    
}