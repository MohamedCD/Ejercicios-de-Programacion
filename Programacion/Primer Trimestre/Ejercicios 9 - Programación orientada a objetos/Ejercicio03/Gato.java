package Ejercicio03;

public class Gato extends Mamifero{
    
    private String raza;
    
    Gato (String nSexo, String nRaza) {
        super(nSexo);
        this.raza = nRaza;
    }
    
    Gato () {
        super();
        this.raza = "noDefinida";
    }
    
    public void maulla() {
        System.out.println("Miauuuu");
    }
    
    public void caza() {
        System.out.println("Estoy cazando ratones");
    }

    public void peleaCon(Gato contrincante) {
        if (this.getSexo().equals("Hembra")) {
            System.out.println("no me gusta pelear");
        } else {
            if (contrincante.getSexo().equals("Hembra")) {
                System.out.println("no peleo contra gatitas");
            } else {
                System.out.println("ven aquí que te vas a enterar");
            }
        }
    }

    
}
