import java.util.Scanner;

public class Ejercicio03{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[][] num = new int[4][5]; 
        int sumaFila, sumaColumna, sumaTotal = 0;

        for(int i = 0; i < num.length; i++) {
            for(int j = 0; j < num[1].length; j++) {
                num[i][j] = (int) (Math.random() * 999 - 100 + 1) + 100;
            }
        }

        for(int i = 0; i < num.length; i++) {
            sumaFila = 0;
            for(int j = 0; j < num[i].length; j++) {
                System.out.printf("%7d ", num[i][j]);
                sumaFila += num[i][j];
            }
            sumaTotal += sumaFila;
            System.out.printf("|%7d\n", sumaFila);
        }

        for(int j = 0; j < num[1].length; j++) {
            System.out.print("----------");
        }
        
        System.out.println("-----------");

        for(int j = 0; j < num[1].length; j++) {
            sumaColumna = 0;
            for(int i = 0; i < num.length; i++) {
                sumaColumna += num[i][j];
            }
            sumaTotal += sumaColumna;
            System.out.printf("%7d ", sumaColumna);
        }
        System.out.printf("|%7d ", sumaTotal);
    }
}