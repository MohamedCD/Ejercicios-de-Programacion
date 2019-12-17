package Ejercicio03;

public abstract class Animal {
    
    String sexo;
    
    Animal(){
        this.sexo = "noDefinido";
    }
    
    Animal(String nSexo){
        this.sexo = nSexo;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void duerme(){
        System.out.println("ZzzzzzZ");
    }
    
    public void come(String comida){
        System.out.println("Estoy comiendo " + comida);
    }

}
