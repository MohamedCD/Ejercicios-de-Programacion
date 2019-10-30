public class Ejercicio10{
    public static void main(String[] args) {
        
        int tipoCarac;
        int longitud = (int) (Math.random()*41)+1;
        char caracter = ' ';
        
        for (int i = 0; i < 10; i++) {
            
            tipoCarac = (int) (Math.random()*6)+1;
            
            switch(tipoCarac){
                
                case 1:
                    caracter = '*';
                break;
                
                case 2:
                    caracter = '-';
                break;
                
                case 3:
                    caracter = '=';
                break;
                
                case 4:
                    caracter = '.';
                break;
                
                case 5:
                    caracter = '|';
                break;
                
                case 6:
                    caracter = '@';
                break;
                
            }
            
            for (int j = 0; j < longitud; j++) {
                System.out.print(caracter);
            }
            
            System.out.println();
            
        }
    }
}