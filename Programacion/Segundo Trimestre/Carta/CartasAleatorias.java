import java.util.ArrayList;

public class CartasAleatorias {
     public static void main(String[] args) {

        ArrayList <Carta> cartas = new ArrayList <Carta>();
        
        Carta cartaAux = new Carta();
        
        cartas.add(cartaAux);
        
        int numCartas = (int) (Math.random() * 10) + 10;
        
        for (int i = 0; i < numCartas;) {
            do {                
                cartaAux = new Carta();
            } while ((cartas.contains(cartaAux)));
            
            i++;
            cartas.add(cartaAux);
        }
        
        for(Carta miCarta : cartas){
            System.out.println(miCarta);
        }

    }    
}
