package ejercicio12;

public class Revista extends Publicacion{
    
    int numero;
    
    Revista(String ISBN, String titulo, int año, int nNumero){
        super(ISBN, titulo, año);
        this.numero = nNumero;
    }
}
