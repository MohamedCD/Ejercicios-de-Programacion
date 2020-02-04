package Ejercicio19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        HashMap <String, String> diccionario = new HashMap <String, String> ();
        
        String palabra, sinonimos = "";

        diccionario.put("caliente", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("ardiente", "hot");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");
        
        System.out.println("Introduzca una palabra y le daré los sinónimos:");
        palabra = sc.nextLine();
        
        if (diccionario.containsKey(palabra)) {
            
            
            for (Map.Entry aux: diccionario.entrySet()) {
                if (diccionario.get(palabra).equals(aux.getValue()) && !palabra.equals(aux.getKey())) {
                    sinonimos += aux.getKey() + " ";
                }
            }
            
            if (!sinonimos.equals("")) {
                sinonimos = "Los sinónimos son: " + sinonimos;
            } else {
                sinonimos = "No conozco sinónimos de esta palabra";
            }
        } 
        
        System.out.println(sinonimos);
        
    }
}
