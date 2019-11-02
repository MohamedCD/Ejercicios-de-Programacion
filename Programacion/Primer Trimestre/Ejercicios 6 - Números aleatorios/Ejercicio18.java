public class Ejercicio18{
    public static void main(String[] args) {

        int color1, color2, color3;
        
        do {            
            color1 = (int) (Math.random()*6)+1;
            color2 = (int) (Math.random()*6)+1;
            color3 = (int) (Math.random()*6)+1;
        } while (color1 == color2 || color2 == color3 || color1 == color3);
        
        switch(color1){
            case 1:
                System.out.println("Habitación 1 --> Rojo");
            break;
            
            case 2:
                System.out.println("Habitación 1 --> Azul");
            break;
            
            case 3:
                System.out.println("Habitación 1 --> Verde");
            break;
            
            case 4:
                System.out.println("Habitación 1 --> Amarillo");
            break;
            
            case 5:
                System.out.println("Habitación 1 --> Violeta");
            break;
            
            case 6:
                System.out.println("Habitación 1 --> Naranja");
            break;
        }
        
        switch(color2){
            case 1:
                System.out.println("Habitación 2 --> Rojo");
            break;
            
            case 2:
                System.out.println("Habitación 2 --> Azul");
            break;
            
            case 3:
                System.out.println("Habitación 2 --> Verde");
            break;
            
            case 4:
                System.out.println("Habitación 2 --> Amarillo");
            break;
            
            case 5:
                System.out.println("Habitación 2 --> Violeta");
            break;
            
            case 6:
                System.out.println("Habitación 2 --> Naranja");
            break;
        }
        
        switch(color3){
            case 1:
                System.out.println("Habitación 3 --> Rojo");
            break;
            
            case 2:
                System.out.println("Habitación 3 --> Azul");
            break;
            
            case 3:
                System.out.println("Habitación 3 --> Verde");
            break;
            
            case 4:
                System.out.println("Habitación 3 --> Amarillo");
            break;
            
            case 5:
                System.out.println("Habitación 3 --> Violeta");
            break;
            
            case 6:
                System.out.println("Habitación 3 --> Naranja");
            break;
        }
    }
}