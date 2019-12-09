package funciones;

public class Ejercicio20_28{
    
    public static int[] generaArrayInt(int tamaño, int minimo, int maximo){
        int [] array = new int [tamaño];
        
        for (int i : array) {
            array [i] = (int) (Math.random() * maximo - minimo + 1) + minimo;
        }
        
        return array;
    }
    
    public static int minimoArrayInt(int[] array) {
        int minimo = Integer.MAX_VALUE;
        
        for (int n : array) {
            if (n < minimo) {
                minimo = n;
            }
        }
        
        return minimo;
    }
    
    public static int maximoArrayInt(int[] array) {
        int maximo = Integer.MIN_VALUE;
        
        for (int n : array) {
            if (n > maximo) {
                maximo = n;
            }
        }
        
        return maximo;
    }
    
    public static int mediaArrayInt(int[] array) {
        int suma = 0;
            for (int n : array) {
                suma += n;
            }
        return suma / array.length;
    }
    
    public static boolean estaEnArrayInt(int[] array, int n) {
        for (int numero : array) {
            if (numero == n) {
                return true;
            }
        }
        
        return false;
    }
    
    public static int posicionEnArrayInt(int[] array, int n) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static int[] volteaArrayInt(int[] array) {
        int[] volteado = new int[array.length];
        
        for(int i = 0; i < array.length; i++) {
            volteado[array.length - i - 1] = array[i];
        }
        
        return volteado;
    }
    
    public static int[] rotaDerechaArrayInt(int[] array, int n) {
        int[] a = array.clone(); // clona en a el contenido de array
        int i;
        int aux;
        
        while (n-- > 0) {
            aux = a[a.length - 1];
            
            for(i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            
            a[0] = aux;
        }
        
        return a;
    }
    
    public static int[] rotaIzquierdaArrayInt(int[] array, int n) {
        int[] a = array.clone(); // clona en a el contenido de array
        int i;
        int aux;
        
        while (n-- > 0) {
            aux = a[0];
            
            for(i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            
            a[a.length - 1] = aux;
        }
        
        return a;
    }
    
    public static void muestraArrayInt(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
  
}
