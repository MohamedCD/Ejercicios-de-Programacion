public class Ejercicio03{
    public static void main(String[] args) {
        
        int carta = (int) (Math.random()*4) + 1;
        int numCarta = (int) (Math.random()*10) + 1;

        switch(numCarta){
            
            case 1:
                System.out.print("as de ");
            break;
            
            case 11:
                System.out.print("sota de ");
            break;

            case 12:
                System.out.print("caballo de ");
            break;  
            
            case 13:
                System.out.print("rey de ");
            break;
            
            default: 
                System.out.print(numCarta + " de ");
            
        }

        switch(carta){
            
            case 1:
                System.out.println("oro");
            break;
            
            case 2:
                System.out.println("espada");
            break;
            
            case 3:
                System.out.println("basto");
            break;
            
            case 4:
                System.out.println("copa");
            break;
            
        }
    }
}