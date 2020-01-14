package Ejercicio03;

public abstract class Ave extends Animal{
    
    Ave(String nSexo) {
        super(nSexo);
    }
    
     Ave() {
        super();
    }
    
    public void ponHuevo() {
        if (this.getSexo().equals("Macho")) {
            System.out.println("Soy macho, no puedo poner huevos");
        } else {
            System.out.println("Ahi va eso... un huevo");
        }
    }
    
    public void limpiate() {
        System.out.println("Me estoy limpiando las plumas");
    }
    
    public void vuela() {
        System.out.println("Estoy volando");
    }
}
