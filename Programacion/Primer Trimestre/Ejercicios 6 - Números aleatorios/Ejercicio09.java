public class Ejercicio09{
    public static void main(String[] args) {
        
        int num, generados = 0;
        
        do {            
            num = (int) (Math.random()*51)+1;
        
            num *= 2;
            
            System.out.print(num + " ");
            
            generados++;
            
        } while (num != 24);
                
        System.out.println("\nSe han generado " + generados + " números");
    }
}