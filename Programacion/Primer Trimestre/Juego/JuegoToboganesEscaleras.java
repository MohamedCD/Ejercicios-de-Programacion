public class JuegoToboganesEscaleras{

    public static void crearTablero(int filas, int columnas){
        int [][] tablero = new int [filas][columnas];
        int contador = 0;
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero [i][j] = contador;
                contador++;
            }
        }
    }
    
    public static void rellenarEscaleras(){
        
    }
    
    public static void rellenarToboganes(){
        
    }

    
    
    public static void main(String[] args){

    }
}