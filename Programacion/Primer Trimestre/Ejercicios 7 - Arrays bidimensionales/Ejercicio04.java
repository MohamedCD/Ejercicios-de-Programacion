import java.util.Scanner;

public class Ejercicio04{
    public static void main(String[] args) throws InterruptedException{
        
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
            Thread.sleep(500);
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
            Thread.sleep(500);
            System.out.printf("%7d ", sumaColumna);
        }
        Thread.sleep(1000);
        System.out.printf("|%7d ", sumaTotal);
    }
}