package Ejercicio03;

public class Ejercicio03 {
    public static void main(String[] args) {
        
        Pinguino tux = new Pinguino("Macho");
        tux.come("palomitas");
        tux.programa();
        
        Perro laika = new Perro("Hembra");
        laika.duerme();
        laika.dameLaPata();
        laika.amamanta();
        laika.cuidaCrias();
        
        Lagarto godzilla = new Lagarto("Macho");
        godzilla.tomaElSol();
        godzilla.duerme();

    } 
}
