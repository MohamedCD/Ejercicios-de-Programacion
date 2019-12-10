package funciones;

public class Ejercicio29_34{
    
    public static int[][] generaArrayBiInt(int filas, int columnas, int minimo, int maximo) {
        int[][] array = new int[filas][columnas];
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * maximo - minimo + 1) + minimo;
            }
        }
        
        return array;
    }
    
    public static int[] filaDeArrayBiInt(int array[][], int fila) {
        int[] f = new int[array[0].length];
        
        for (int i = 0; i < array[0].length; i++) {
            f[i] = array[fila][i];
        }
        
        return f;
    }
    
    public static int[] columnaDeArrayBiInt(int array[][], int columna) {
        int[] c = new int [array.length];
        
        for (int i = 0; i < array.length; i++) {
            c[i] = array[i][columna];
        }
        
        return c;
    }
    
    public static int[] coordenadasEnArrayBiInt(int array[][], int n) {
        for (int f = 0; f < array.length; f++) {
            for (int c = 0; c < array[0].length; c++) {
                if (array[f][c] == n) {
                    int[] coordenadas = {f, c};
                    return coordenadas;
                }
            }
        }
        
        int[] coordenadas = {-1, -1};
        
        return coordenadas;
    }
    
    public static boolean esPuntoDeSilla(int array[][], int i, int j) {
        int[] fila = filaDeArrayBiInt(array, i);
        int[] columna = columnaDeArrayBiInt(array, j);

        return ((funciones.FuncionesArray.minimoArrayInt(fila) == array[i][j]) && (funciones.FuncionesArray.maximoArrayInt(columna) == array[i][j]));
    }

    public static int[] diagonal(int array[][], int fila, int columna, String direccion) {
        int elementos = 0;
        int[] diagonalAux = new int [array.length];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ( (((columna - j) == (fila - i)) && (direccion.equals("nose"))) || (((columna - j) == (i - fila)) && (direccion.equals("neso"))) ) {
                    diagonalAux[elementos++] = array[i][j];
                }
            }
        }
        
        int[] diagonal = new int[elementos];

        for (int j = 0; j < elementos; j++) {
            diagonal[j] = diagonalAux[j];
        }
        
        return diagonal;
    }
   
}
