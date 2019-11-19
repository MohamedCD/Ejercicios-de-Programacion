import java.util.Scanner;

public class Ejercicio14{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String [] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String [] palabra = new String[8];
        String [] palabraFinal = new String[8];
        
        boolean color = true;
        
        int contador = 0;
        
        for (int i = 0; i < palabra.length; i++) {
            System.out.println("Introduce una palabra");
            palabra [i] = sc.nextLine();
        }
        
        for (int i = 0; i < palabraFinal.length; i++) {
            for (int j = 0; j < colores.length; j++) {
                if (palabra[i].equals(colores[j])) {
                    palabraFinal[contador] = palabra[i];
                    contador++;
                }
            }
        }
        
        for (int i = 0; i < palabraFinal.length; i++) {
            for (int j = 0; j < colores.length; j++) {
                if (palabra[i].equals(colores[j])) {
                    color = false;
                }
            }
            if (color) {
                palabraFinal[contador] = palabra[i];
                contador++;
            }
            color = true;
        }
        
        for (int i = 0; i < palabraFinal.length; i++) {
            System.out.print(palabraFinal[i] + " ");
        }
        
    }
}