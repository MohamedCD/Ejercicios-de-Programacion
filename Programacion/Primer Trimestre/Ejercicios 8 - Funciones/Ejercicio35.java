package funciones;

public class Ejercicio35{
    
    public static String convierteEnPalotes(int num){
        String palote = "";
        
        int numero = funciones.Funciones.voltea(num);
        
        for (int i = 0; i < funciones.Funciones.digitos(num); i++) {
            for (int j = 0; j < numero % 10; j++) {
                palote += "|";
            }
            
            if (numero > 10) {
                palote += "-"; 
            }
            
            numero /= 10;
        }
        
        return palote;
    }

}