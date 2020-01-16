package ejercicio12;

public class Libro extends Publicacion implements Prestable{
    
    boolean prestado = false;
    
    Libro(String ISBN, String titulo, int año){
        super(ISBN, titulo, año);
    }
    
    @Override
    public void presta(){
        prestado = true;
    }
    
    @Override
    public void devuelve(){
        prestado = false;
    }
    
    @Override
    public boolean estaPrestado(){
        return prestado;
    }
    
    @Override
    public String toString(){
        if (prestado) {
            return super.toString() + " (prestado)";
        } else {
            return super.toString() + " (no prestado)";
        }
    }
    
}
