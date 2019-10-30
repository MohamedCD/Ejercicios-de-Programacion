public class Ejercicio01{
    public static void main(String[] args) {
        
        int dado1 = (int) (Math.random()*6) + 1;
        int dado2 = (int) (Math.random()*6) + 1;
        int dado3 = (int) (Math.random()*6) + 1;
        int suma;
        
        suma = dado1 + dado2 + dado3;
        
        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println(dado3);
        System.out.println("La suma de las tiradas es: " + suma);
        
    }
}