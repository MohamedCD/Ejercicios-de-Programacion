public class PruebaPiramide {
    public static void main(String[] args) {
    
        Piramide P1 = new Piramide(6, '*');
        Piramide P2 = new Piramide(12, '*');
        Piramide P3 = new Piramide(1, '*');
        
        System.out.println(P1);
        
        P1.Aumentar();
        P1.Aumentar();
        System.out.println(P1);
        
        P1.CambiarCaracter('o');
        for (int i = 0; i < 6; i++) {
            P1.Disminuir();
        }
        System.out.println(P1);
        
        System.out.println(P2);
        P2.Aumentar();
        System.out.println(P2);
        
        System.out.println(P3);
        P3.Disminuir();
        System.out.println(P3);
    }
}
