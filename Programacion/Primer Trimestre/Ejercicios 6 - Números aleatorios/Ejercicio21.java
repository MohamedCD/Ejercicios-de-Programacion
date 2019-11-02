public class Ejercicio21{
    public static void main(String[] args) {
        
        String caraCruz = "", moneda = "";
        int numMoneda, numLado;
        
        numMoneda = (int) (Math.random()*8)+1;
        numLado = (int) (Math.random()*2)+1;
        
        switch(numMoneda){
            case 1:
                moneda = "1 céntimo";
            break;
            
            case 2:
                moneda = "2 céntimos";
            break;
            
            case 3:
                moneda = "5 céntimos";
            break;
            
            case 4:
                moneda = "10 céntimos";
            break;
            
            case 5:
                moneda = "20 céntimos";
            break;
            
            case 6:
                moneda = "50 céntimos";
            break;
            
            case 7:
                moneda = "1 euro";
            break;
            
            case 8:
                moneda = "2 euros";
            break;   
        }
        
        if (numLado == 1) {
            caraCruz = "cara";
        }else{
            caraCruz = "cruz";
        }

        System.out.println(moneda + " - " + caraCruz);
    }
}