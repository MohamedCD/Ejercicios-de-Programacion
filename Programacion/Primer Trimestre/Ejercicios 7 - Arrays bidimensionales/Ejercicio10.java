import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        char [] [] tablero = new char [3] [3];
        tablero[0][0] = '1';
        tablero[0][1] = '2';
        tablero[0][2] = '3';
        tablero[1][0] = '4';
        tablero[1][1] = '5';
        tablero[1][2] = '6';
        tablero[2][0] = '7';
        tablero[2][1] = '8';
        tablero[2][2] = '9';
        
        int jugador1Fila, jugador2Fila, jugador1Columna, jugador2Columna, contador = 0;
        boolean terminada = false;
        
        System.out.println("----------------");
        System.out.println("|    |    |    |");
        System.out.println("----------------");
        System.out.println("|    |    |    |");
        System.out.println("----------------");
        System.out.println("|    |    |    |");
        System.out.println("----------------");
        
        do {   
            
            System.out.println("Introduzca fila y columna de la ficha del jugador 1");
            jugador1Fila = sc.nextInt() - 1;
            jugador1Columna = sc.nextInt() - 1;
            contador++;
            
            tablero [jugador1Fila] [jugador1Columna] = 'X';
            
            if (contador < 9) {
                System.out.println("Introduzca fila y columna de la ficha del jugador 2");
                jugador2Fila = sc.nextInt() - 1;
                jugador2Columna = sc.nextInt() - 1;
                contador++;
                
                tablero [jugador2Fila] [jugador2Columna] = 'O';
            }
            
            if (tablero[0][0] == tablero[0][1] && tablero[0][1] == tablero[0][2] ||
                tablero[1][0] == tablero[1][1] && tablero[1][1] == tablero[1][2] ||
                tablero[2][0] == tablero[2][1] && tablero[2][1] == tablero[2][2] ||
                tablero[0][0] == tablero[1][0] && tablero[1][0] == tablero[2][0] ||
                tablero[0][1] == tablero[1][1] && tablero[1][1] == tablero[2][1] ||
                tablero[0][2] == tablero[1][2] && tablero[1][2] == tablero[2][2] ||
                tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] ||
                tablero[2][0] == tablero[1][1] && tablero[1][1] == tablero[0][2]) {
                terminada = true;
            }
            
        } while (terminada == false && contador < 9);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}