public class Ejercicio13{
    public static void main(String[] args) {
        
        int dado1;
        int dado2;
        boolean dadosIguales = false;
                
        do {            
            
            dado1 = (int) (Math.random()*6)+1;
            dado2 = (int) (Math.random()*6)+1;
            
            System.out.println("Dado 1 --> " + dado1 + "\nDado 2 --> " + dado2 + "\n");
            
            if (dado1 == dado2) {
                dadosIguales = true;
            }
            
        } while (dadosIguales == false);
    }
}