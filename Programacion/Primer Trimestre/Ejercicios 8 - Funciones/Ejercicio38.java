package funciones;

public class Ejercicio38{
    
    public int[] filtraCapicuas(int array[]){
        int[] aux = new int[array.length];
        int cuentaCapicuas = 0;
        
        for (int numero : array) {
            if (funciones.Funciones.esCapicua(numero)) {
                aux[cuentaCapicuas++] = numero;
            }
        }
        
        int[] capicua = new int[cuentaCapicuas];
        
        for (int i = 0; i < cuentaCapicuas; i++) {
            capicua[i] = aux[i];
        }
        
        return capicua;
    }

}