import java.util.ArrayList;

public class Ejercicio02 {
    public static void main(String[] args) {
      
        ArrayList <Integer> numeros = new ArrayList <Integer>();
        
        int tamaño, suma = 0, media, maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;
        
        tamaño = (int) (Math.random() * 20 + 1) + 10;
        
        for (int i = 0; i < tamaño; i++) {
            numeros.add((int) (Math.random() * 100 + 1));
            suma += numeros.get(i);
            
            if (maximo < numeros.get(i)) {
                maximo = numeros.get(i);
            }
            
            if (minimo > numeros.get(i)) {
                minimo = numeros.get(i);
            }
        }
        
        media = suma / tamaño;
        
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
        
        System.out.println();
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }    
}