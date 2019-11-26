import java.util.Scanner;

public class Ejercicio05{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int[][] num = new int[6][10]; 
        int numMax, numMin;

        for(int i = 0; i < num.length; i++) {
            for(int j = 0; j < num[1].length; j++) {
                num[i][j] = (int) (Math.random() * 1001);
            }
        }
        
        numMax = num [0] [0];
        numMin = num [0] [0];

        for(int i = 0; i < num.length; i++) {
            for(int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
                if (num [i] [j] > numMax) {
                    numMax = num [i] [j];
                }
                if (num [i] [j] < numMin) {
                    numMax = num [i] [j];
                }
            }
            System.out.println("");
        }
        
        for(int i = 0; i < num.length; i++) {
            for(int j = 0; j < num[i].length; j++) {
                if (num [i] [j] == numMax) {
                    System.out.println("Número máximo se encuentra en la fila " + (i+1) + " y en la columna " + (j+1));
                }
                if (num [i] [j] == numMin) {
                    System.out.println("Número mínimo se encuentra en la fila " + (i+1) + " y en la columna " + (j+1));
                }
            }
        }
    }
}