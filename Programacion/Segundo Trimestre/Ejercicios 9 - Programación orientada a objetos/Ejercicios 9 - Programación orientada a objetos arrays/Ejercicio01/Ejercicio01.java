package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nombre, color, raza;
        
        Gato[] gato = new Gato[4];
        
        for (int i = 0; i < gato.length; i++) {
            gato[i] = new Gato();
            
            System.out.println("Introduzca el nombre del gato " + (i+1));
            nombre = sc.nextLine();
            gato[i].setNombre(nombre);
            
            System.out.println("Introduzca el color del gato " + (i+1));
            color = sc.nextLine();
            gato[i].setColor(color);
            
            System.out.println("Introduzca el raza del gato " + (i+1));
            raza = sc.nextLine();
            gato[i].setRaza(raza);
        }
        
        for (int i = 0; i < gato.length; i++) {
            System.out.println("Los datos del gato " + (i+1) + " son:");
            System.out.println("Nombre: " + gato[i].getNombre());
            System.out.println("Color: " + gato[i].getColor());
            System.out.println("Raza: " + gato[i].getRaza());
        }   
    } 
}
