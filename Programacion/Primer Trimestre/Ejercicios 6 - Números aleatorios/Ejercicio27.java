import java.util.Scanner;

public class Ejercicio27{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String manoJugador, manoOrdenador = "";
        int num;
        
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        manoJugador = sc.nextLine();
        
        num = (int) (Math.random() * 3 + 1);
        
        switch(num){
            case 1:
                System.out.print("Turno del ordenador: piedra");
                manoOrdenador = "piedra";
            break;
            
            case 2:
                System.out.print("Turno del ordenador: papel");
                manoOrdenador = "papel";
            break;
            
            case 3:
                System.out.print("Turno del ordenador: tijera");
                manoOrdenador = "tijera";
            break;
        }
        
        if (manoJugador.equals(manoOrdenador)) {
            System.out.println("\nEmpate");
        }
        else if(manoJugador.equals("piedra") && manoOrdenador.equals("papel")){
            System.out.println("\nGana el ordenador");
        }
        else if(manoJugador.equals("piedra") && manoOrdenador.equals("tijera")){
            System.out.println("\nGana el jugador");
        }
        else if(manoJugador.equals("papel") && manoOrdenador.equals("tijera")){
            System.out.println("\nGana el ordenador");
        }
        else if(manoJugador.equals("papel") && manoOrdenador.equals("piedra")){
            System.out.println("\nGana el jugador");
        }
        else if(manoJugador.equals("tijera") && manoOrdenador.equals("piedra")){
            System.out.println("\nGana el ordenador");
        }
        else{
            System.out.println("\nGana el jugador");
        }
    }
}