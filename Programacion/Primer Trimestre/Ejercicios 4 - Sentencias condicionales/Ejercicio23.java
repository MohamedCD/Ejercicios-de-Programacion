import java.util.Scanner;

public class Ejercicio23{
    public static void main(String[] args) {

			
        Scanner sc = new Scanner(System.in);
	
        String tipoIva, codProm;
        
        float baseImponible, iva = 0, precioFinal = 0;

        System.out.println("Introduce la base imponible");
        baseImponible = sc.nextFloat();
        
        sc.nextLine();

        System.out.println("Introduce el tipo de IVA aplicado (general, reducido o superreducido)");
        tipoIva = sc.nextLine();

        System.out.println("Introduce el código promocional (nopro, mitad, meno5, 5porc)");
        codProm = sc.nextLine();

        switch(tipoIva){
            
            case "general": 
                
                iva = baseImponible * 0.21f;
                
                switch(codProm){
                    case "nopro": 
                        precioFinal = baseImponible + iva;
                    break;
                    
                    case "mitad":
                        precioFinal = (baseImponible + iva) / 2;
                    break;
                    
                    case "meno5": 
                        precioFinal = baseImponible + iva - 5;
                    break;
                    
                    case "5porc":
                        precioFinal = (baseImponible + iva) * 0.95f;
                }
            break;
            
            case "reducido": 
                
                iva = baseImponible * 0.10f;
                
                switch(codProm){
                    case "nopro": 
                        precioFinal = baseImponible + iva;
                    break;
                    
                    case "mitad":
                        precioFinal = (baseImponible + iva) / 2;
                    break;
                    
                    case "meno5": 
                        precioFinal = baseImponible + iva - 5;
                    break;
                    
                    case "5porc":
                        precioFinal = (baseImponible + iva) * 0.95f;
                }
            break;
            
            case "superreducido": 
                
                iva = baseImponible * 0.04f;
                
                switch(codProm){
                    case "nopro": 
                        precioFinal = baseImponible + iva;
                    break;
                    
                    case "mitad":
                        precioFinal = (baseImponible + iva) / 2;
                    break;
                    
                    case "meno5": 
                        precioFinal = baseImponible + iva - 5;
                    break;
                    
                    case "5porc":
                        precioFinal = (baseImponible + iva) * 0.95f;
                }
            break;
        }   
       
        System.out.println("Base imponible: " + baseImponible);
        System.out.println("IVA: " + iva);
        System.out.println("Precio con IVA: " + (iva+baseImponible));
        System.out.println("Cód. promo: -" + (baseImponible + iva - precioFinal) );
        System.out.println("TOTAL: " + precioFinal);
    }
}