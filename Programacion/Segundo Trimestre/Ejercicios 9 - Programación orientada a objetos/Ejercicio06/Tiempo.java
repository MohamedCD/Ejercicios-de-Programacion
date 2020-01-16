package ejercicio06;

public class Tiempo {

    int hora;
    int minuto;
    int segundo;

    Tiempo(int nHora, int nMinuto, int nSegundo){
        this.hora = nHora;
        this.minuto = nMinuto;
        this.segundo = nSegundo;
    }
    
    public int getHora(){
        return this.hora;
    }
    
    public int getMinuto(){
        return this.minuto;
    }
    
    public int getSegundo(){
        return this.segundo;
    }

    public Tiempo suma(Tiempo T) {
        int horaFinal, minutoFinal, segundoFinal;
        
        horaFinal = this.hora + T.getHora();
        minutoFinal = this.minuto + T.getMinuto();
        segundoFinal = this.segundo + T.getSegundo();
        
        if (segundoFinal >= 60) {
            segundoFinal -= 60;
            minutoFinal++;
        }
        
        if (minutoFinal >= 60) {
            minutoFinal -= 60;
            horaFinal++;
        }
        
        return new Tiempo(horaFinal, minutoFinal, segundoFinal);
    }
    
    public Tiempo resta(Tiempo T) {
        int horaFinal, minutoFinal, segundoFinal;
        
        horaFinal = this.hora - T.getHora();
        minutoFinal = this.minuto - T.getMinuto();
        segundoFinal = this.segundo - T.getSegundo();
        
        return new Tiempo(horaFinal, minutoFinal, segundoFinal);
    }
    
    public String toString(){
        return this.hora + "h " + this.minuto + "m " + this.segundo + "s";
    }

}
