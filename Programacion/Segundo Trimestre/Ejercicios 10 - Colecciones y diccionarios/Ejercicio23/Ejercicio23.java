import java.util.ArrayList;

public class Ejercicio23 {
    public static void main(String[] args){
        
        ArrayList<Figura> figuras = new ArrayList<>();
        
        figuras.add(new Figura("Dama", 9, 1));
        figuras.add(new Figura("Torre", 5, 2));
        figuras.add(new Figura("Alfil", 3, 2));
        figuras.add(new Figura("Caballo", 2, 2));
        figuras.add(new Figura("Peón", 1, 8));
        
        int capturasTotales, peonesTotales = 0;
        
        capturasTotales = (int) (Math.random() * 16);
        
        System.out.println("Fichas capturadas por el jugador:");

        for (int i = 0; i < capturasTotales;) {
            
            Figura figuraAux = figuras.get((int) (Math.random() * figuras.size()));
            
            if (figuraAux.esCapturable()) {
                figuraAux.captura();
                System.out.println(figuraAux);
                peonesTotales += figuraAux.getValor();
                i++;
            }
        }
        
        System.out.println("Puntos totales: " + peonesTotales);
    }
}
