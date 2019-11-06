import java.util.Scanner;

public class Ejercicio29{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int tempMinima = 0, tempMaxima = 0, estacion, tiempoProbabilidad;
        String tiempo = "";
        
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        
        System.out.print("Seleccione la estación del año (1-4): ");
        estacion = sc.nextInt();
        
        switch(estacion){
            case 1:
                tempMinima = (int) (Math.random() * (30 - 15 + 1)) + 15;
                tempMaxima = (int) (Math.random() * (30 - tempMinima + 1)) + tempMinima;
                tiempoProbabilidad = (int) (Math.random() * (10)) + 1;
                
                if (tiempoProbabilidad <= 6) {
                    tiempo = "Soleado";
                }else{
                    tiempo = "Nublado";
                }
            break;
            
            case 2:
                tempMinima = (int) (Math.random() * (45 - 25 + 1)) + 25;
                tempMaxima = (int) (Math.random() * (30 - tempMinima + 1)) + tempMinima;
                tiempoProbabilidad = (int) (Math.random() * (10)) + 1;
                
                if (tiempoProbabilidad <= 8) {
                    tiempo = "Soleado";
                }else{
                    tiempo = "Nublado";
                }
            break;
            
            case 3:
                tempMinima = (int) (Math.random() * (30 - 20 + 1)) + 20;
                tempMaxima = (int) (Math.random() * (30 - tempMinima + 1)) + tempMinima;
                tiempoProbabilidad = (int) (Math.random() * (10)) + 1;
                
                if (tiempoProbabilidad <= 4) {
                    tiempo = "Soleado";
                }else{
                    tiempo = "Nublado";
                }
            break;
            
            case 4:
                tempMinima = (int) (Math.random() * (25 - 0 + 1)) + 0;
                tempMaxima = (int) (Math.random() * (30 - tempMinima + 1)) + tempMinima;
                tiempoProbabilidad = (int) (Math.random() * (10)) + 1;
                
                if (tiempoProbabilidad <= 2) {
                    tiempo = "Soleado";
                }else{
                    tiempo = "Nublado";
                }
            break;
        }   
        
        System.out.println("\nPrevisión del tiempo para mañana");
        System.out.println("---------------------------------");
        System.out.println("Temperatura mínima: " + tempMinima + "ºC");
        System.out.println("Temperatura máxima: " + tempMaxima + "ºC");
        System.out.println(tiempo);
    }
}