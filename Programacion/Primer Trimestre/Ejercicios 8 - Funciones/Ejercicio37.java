package funciones;

public class Ejercicio37{
    
    public String convierteEnMorse(int num){
        String morse = "";
        
        int numero = funciones.Funciones.voltea(num);
        
        for (int i = 0; i < funciones.Funciones.digitos(num); i++) {
            switch(numero % 10){
                case 0:
                    morse += "----";
                break;
                
                case 1:
                    morse += ".----";
                break;
                
                case 2:
                    morse += "..---";
                break;
                
                case 3:
                    morse += "...--";
                break;
                
                case 4:
                    morse += "....-";
                break;
                
                case 5:
                    morse += ".....";
                break;
                
                case 6:
                    morse += "-....";
                break;
                
                case 7:
                    morse += "--...";
                break;
                
                case 8:
                    morse += "---..";
                break;
                
                case 9:
                    morse += "----.";
                break;
                
            }
            
            numero /= 10;
        }
        
        return morse;
    }

}