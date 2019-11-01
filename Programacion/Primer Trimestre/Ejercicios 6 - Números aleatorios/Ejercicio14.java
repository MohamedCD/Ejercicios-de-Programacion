import java.util.Scanner;

public class Ejercicio14{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num, minimo = 0, maximo = 100;
        int intentos = 5;
        String valor;
        
        boolean acertado = false;
        
        do {            
            
            num = (int) (Math.random()*maximo - minimo) + minimo;
            
            System.out.println("¿Es el número " + num + "?");
            valor = sc.nextLine();
            
            if (valor.equals("mayor")) {
                minimo = num;
            }
            else if(valor.equals("menor")){
                maximo = num;
            }
            else{
                acertado = true;
            }
            
            intentos--;
            
        } while (intentos > 0 && acertado == false);    }
}