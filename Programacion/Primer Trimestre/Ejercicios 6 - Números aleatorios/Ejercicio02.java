public class Ejercicio02{
    public static void main(String[] args) {
        
        int carta = (int) (Math.random()*4) + 1;
        int numCarta = (int) (Math.random()*13) + 1;

        switch(numCarta){
            
            case 1:
                System.out.print("A de ");
            break;
            
            case 11:
                System.out.print("J de ");
            break;

            case 12:
                System.out.print("Q de ");
            break;  
            
            case 13:
                System.out.print("K de ");
            break;
            
            default: 
                System.out.print(numCarta + " de ");
            
        }

        switch(carta){
            
            case 1:
                System.out.println("picas");
            break;
            
            case 2:
                System.out.println("corazones");
            break;
            
            case 3:
                System.out.println("diamantes");
            break;
            
            case 4:
                System.out.println("tréboles");
            break;
            
        }
    }
}