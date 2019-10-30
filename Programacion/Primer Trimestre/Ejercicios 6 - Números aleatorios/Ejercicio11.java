public class Ejercicio11{
    public static void main(String[] args) {
        
        int nota;
        int suspenso = 0, suficiente = 0, bien = 0, notable = 0, sobresaliente = 0; 
        
        for (int i = 0; i < 20; i++) {
            
            nota = (int) (Math.random()*10)+1;
           
            switch(nota){
                case 5:
                    System.out.println("suficiente");
                    suficiente++;
                break;

                case 6:
                    System.out.println("bien");
                    bien++;
                break;

                case 7: case 8:
                    System.out.println("notable");
                    notable++;
                break;

                case 9: case 10:
                    System.out.println("sobresaliente");
                    sobresaliente++;
                break;

                default:
                    System.out.println("suspenso");
                    suspenso++;
            }
        }
        
        System.out.println("\nSuspensos " + suspenso);
        System.out.println("Suficientes " + suficiente);
        System.out.println("Bien " + bien);
        System.out.println("Notables " + notable);
        System.out.println("Sobresalientes " + sobresaliente);
    }
}