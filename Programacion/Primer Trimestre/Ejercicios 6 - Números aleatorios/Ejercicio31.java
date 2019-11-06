import java.util.Scanner;

public class Ejercicio31{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int cantidadApostada, cantidadFinal = 0, dado1, dado2, sumaDados = 0, sumaDados2 = 0;
        
        System.out.print("Introduzca la cantidad que apostará: ");
        cantidadApostada = sc.nextInt();
        
        dado1 = (int) (Math.random() * 6) + 1;
        dado2 = (int) (Math.random() * 6) + 1;
        
        sumaDados = dado1 + dado2;
        
        switch(sumaDados){
            case 7: case 11:
                cantidadFinal = cantidadApostada * 2;
            break;
            
            case 2: case 3: case 12:
                cantidadFinal = 0;
            break;
            
            default:
                do {                    
                    dado1 = (int) (Math.random() * 6) + 1;
                    dado2 = (int) (Math.random() * 6) + 1;
        
                    sumaDados2 = dado1 + dado2;
                } while (sumaDados2 != sumaDados && sumaDados2 != 7);
                
                if (sumaDados == sumaDados2) {
                    cantidadFinal = cantidadApostada * 2;
                }
                else{
                    cantidadFinal = 0;
                }
            break;
        }
        
        System.out.println("La cantidad final será " + cantidadFinal);
    }
}