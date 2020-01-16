package ejercicio12;

public class Publicacion {
    
    String ISBN;
    String titulo;
    int año;
    
    Publicacion(String nISBN, String nTitulo, int nAño){
        this.ISBN = nISBN;
        this.titulo = nTitulo;
        this.año = nAño;
    }
    
    public void setISBN(String nISBN){
        ISBN = nISBN;
    }
    
    public void setTitulo(String nTitulo){
        titulo = nTitulo;
    }
    
    public void setAño(int nAño){
        año = nAño;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getAño(){
        return año;
    }
    
    public String toString(){
        return "ISBN: " + this.ISBN + ", título: " + this.titulo + ", año de publicación: " + this.año;
    }
}
