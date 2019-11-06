import java.util.Scanner;

public class Ejercicio30{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int anchura, altura, anchuraPez, alturaPez, anchuraCaballito, alturaCaballito, anchuraCaracola, alturaCaracola;
        
        
        System.out.println("Introduzca la anchura (como mínimo 4)");
        anchura = sc.nextInt();
        
        System.out.println("Introduzca la altura (como mínimo 4)");
        altura = sc.nextInt();
        
        anchuraPez = (int) (Math.random() * anchura-2)+2;
        alturaPez = (int) (Math.random() * altura-2)+2;
        
        do {            
            anchuraCaballito = (int) (Math.random() * anchura-2)+2;
            alturaCaballito = (int) (Math.random() * altura-2)+2;
        } while (anchuraCaballito == anchuraPez || alturaCaballito == alturaPez);
        
        do {            
            anchuraCaracola = (int) (Math.random() * anchura-2)+2;
            alturaCaracola = (int) (Math.random() * altura-2)+2;
        } while (anchuraCaracola == anchuraPez || alturaCaracola == alturaPez || anchuraCaracola == anchuraCaballito || alturaCaracola == alturaCaballito);
    
        for (int i = 1; i <= altura; i++) {
            if (i == 1 || i == altura) {
                for (int j = 0; j < anchura; j++) {
                    System.out.print("* ");
                }
            }else{
                System.out.print("*");
                
                for (int j = 0; j < anchura * 2 - 3; j++) {
                    if (i == alturaPez && j == anchuraPez) {
                        System.out.print("&");
                    }
                    else if(i == alturaCaballito && j == anchuraCaballito){
                        System.out.print("$");
                    }
                    else if(i == alturaCaracola && j == anchuraCaracola){
                        System.out.print("@");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        }     
    }
}