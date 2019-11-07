public class Ejercicio02{
    public static void main(String[] args) {
        
        char [] caracter = new char[10];
        
        caracter [0] = 'a';
        caracter [1] = 'x';
        caracter [4] = '@';
        caracter [6] = ' ';
        caracter [7] = '+';
        caracter [8] = 'Q';
        
        for (int i = 0; i < caracter.length; i++) {
            System.out.println(caracter[i]);
        }  
    }
}