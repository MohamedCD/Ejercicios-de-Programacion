package Ejercicio03;

public class Lagarto extends Animal{
    
    Lagarto(String nSexo) {
        super(nSexo);
    }
    
    Lagarto(){
        super();
    }
    
    public void tomaElSol() {
        System.out.println("Estoy tomando el Sol");
    }
    
    public void bañate() {
        System.out.println("Me estoy dando un chapuzón");
    }
    
    public void escondete() {
        System.out.println("Me he escondido, ya no me puedes ver");
    }
    
}
