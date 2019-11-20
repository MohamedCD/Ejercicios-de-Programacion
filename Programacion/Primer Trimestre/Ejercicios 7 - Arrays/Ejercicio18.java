public class Ejercicio18{
    public static void main(String[] args) {
                
        int[] num = new int[10];
        int[] menores = new int[10];
        int[] mayores = new int[10];
        int[] resultado = new int[10];
        int cuentaMenores = 0, cuentaMayores = 0, menoresColocados = 0, mayoresColocados = 0, j = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 201);
            if (num[i] <= 100) {
                menores[cuentaMenores++] = num[i];
            } else {
                mayores[cuentaMayores++] = num[i];
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        
        System.out.println();

        do {
            if (menoresColocados < cuentaMenores) {
                resultado[j++] = menores[menoresColocados++];
            }
            if (mayoresColocados < cuentaMayores) {
                resultado[j++] = mayores[mayoresColocados++];
            }
        } while (j < 10);

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}