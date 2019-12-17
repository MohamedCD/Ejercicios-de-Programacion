package Ejercicio03;

public class Perro extends Mamifero{
    
    Perro (String nSexo) {
        super(nSexo);
    }
    
    Perro(){
        super();
    }
    
    public void ladra() {
        System.out.println("Guau guau");
    }
    
    public void dameLaPata() {
        System.out.println("Toma mi patita");
    }
    
    public void caza() {
        System.out.println("Estoy cazando perdices");
    }
  
}
