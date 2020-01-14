import java.util.Scanner;

public class JuegoToboganesEscaleras{

    public static String[][] crearTablero(String dificultad){
        int contador = 1, filas = 0, columnas = 0;

        switch(dificultad){
            case "facil":
                filas = 6;
                columnas = 6;
            break;

            case "normal":
                filas = 8;
                columnas = 8;
            break;

            case "dificil":
                filas = 10;
                columnas = 10;
            break;
        }

        String [][] tablero = new String [filas][columnas];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero [i][j] = contador + "";
                contador++;
            }
        }

        return tablero;
    }

    public static String[][] rellenarEscaleras(String[][] tablero){
        int escalerasPuestas = 0, filaEscalera, columnaEscalera, aux = 0;
        
        do {            
            filaEscalera = (int) (Math.random() * tablero.length);
            columnaEscalera = (int) (Math.random() * tablero[0].length);
            
            aux = Integer.parseInt(tablero [filaEscalera] [columnaEscalera]);

            if (!tablero [filaEscalera] [columnaEscalera].equals("H") && aux + 5 < (tablero.length * tablero[0].length)) {
                tablero [filaEscalera] [columnaEscalera] = "H";
                escalerasPuestas++;
            }
            
        } while (escalerasPuestas < 5);
        
        return tablero;
    }

    public static String[][] rellenarSerpientes(String[][] tablero, String dificultad){
        int serpientesPuestas = 0, filaSerpiente, columnaSerpiente, serpientesAPoner = 0, aux = 0;
        
        switch(dificultad){
            
            case "facil":
                serpientesAPoner = 5;
            break;
            
            case "normal":
                serpientesAPoner = 10;
            break;
            
            case "dificil":
                serpientesAPoner = 15;
            break;
            
            default:
        }
        
        do {            
            filaSerpiente = (int) (Math.random() * tablero.length);
            columnaSerpiente = (int) (Math.random() * tablero[0].length);
            
            aux = Integer.parseInt(tablero [filaSerpiente] [columnaSerpiente]);
            //&&  && !tablero [filaSerpiente] [columnaSerpiente].equals("s")
            //(tablero.length * tablero[0].length) != aux 
            
            if (!tablero [filaSerpiente] [columnaSerpiente].equals("H") && Integer.parseInt(tablero [filaSerpiente] [columnaSerpiente]) - 5 > 0) {
                tablero [filaSerpiente] [columnaSerpiente] = "s";
                serpientesPuestas++;
            }
            
        } while (serpientesPuestas < serpientesAPoner);
        
        return tablero;
    }

    public static void mostrarTablero(String[][] tablero){
        for (int i = tablero.length - 1; i >= 0; i--) {
            for (int j = tablero[0].length - 1; j >= 0 ; j--) {
                System.out.printf("%4s %s", tablero [i][j], " ");
            }
            System.out.println();
        }
    }

    public static int tirarDado(){
        int tirada = 0;

        tirada = (int) (Math.random() * 6) + 1;
        System.out.println("En el dado ha salido el número " + tirada);

        return tirada;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String dificultad, posicionFichaString1 = "", posicionFichaString2 = "", aux1 = "", aux2 = "", dadoExtraOpcion1 = "", dadoExtraOpcion2 = "";
        int posicionFicha1 = 0, posicionFicha2 = 0, dado1, dado2, turno = 0, tamañoTablero = 0, fila1 = 0, fila2 = 0, columna1 = 0, columna2 = 0;
        boolean dadoExtra1 = true, dadoExtra2 = true;

        System.out.println("Elige la dificultad (facil/normal/dificil)");
        dificultad = sc.nextLine();

        String[][] tablero = crearTablero(dificultad);
        tablero = rellenarEscaleras(tablero);
        tablero = rellenarSerpientes(tablero, dificultad);
        mostrarTablero(tablero);
        System.out.println();

        tamañoTablero = tablero.length * tablero[0].length;

        do {

            if (dadoExtra1) {
                System.out.println("Jugador 1: ¿Quieres usar el dado extra? ten en cuenta que solo lo puedes usar una vez (si/no)");
                dadoExtraOpcion1 = sc.nextLine();

                if (dadoExtraOpcion1.equals("si")) {
                    System.out.print("Jugador 1: ");
                    dado1 = tirarDado();
                    posicionFicha1 += dado1;
                    dadoExtra1 = false;
                }
            }

            System.out.print("Jugador 1: ");
            dado1 = tirarDado();

            if (dadoExtra2) {
                System.out.println("Jugador 2: ¿Quieres usar el dado extra? ten en cuenta que solo lo puedes usar una vez (si/no)");
                dadoExtraOpcion2 = sc.nextLine();

                if (dadoExtraOpcion2.equals("si")) {
                    System.out.print("Jugador 2: ");
                    dado2 = tirarDado();
                    posicionFicha2 += dado2;
                    dadoExtra2 = false;
                }
            }

            System.out.print("Jugador 2: ");
            dado2 = tirarDado();

            if (posicionFicha1 + dado1 <= tamañoTablero) {
                posicionFicha1 += dado1;
                posicionFichaString1 = Integer.toString(posicionFicha1);

                if (posicionFichaString1 == "H") {
                    posicionFicha1 += 5;
                    posicionFichaString1 = Integer.toString(posicionFicha1);
                    System.out.println("Jugador 1 : Has subido por una escalera y por tanto avanzas 5 casillas");
                } else if (posicionFichaString1 == "s") {
                    posicionFicha1 -= 5;
                    posicionFichaString1 = Integer.toString(posicionFicha1);
                    System.out.println("Jugador 1 : Te ha mordido la serpiente y por tanto desciendes 5 casillas");
                }

            } else {
                System.out.println("Jugador 1 : ¡Te has pasado!, debes acabar en la casilla exacta");
            }

            if (posicionFicha2 + dado2 <= tamañoTablero) {
                posicionFicha2 += dado2;
                posicionFichaString2 = Integer.toString(posicionFicha2);

                if (posicionFichaString2 == "H") {
                    posicionFicha2 += 5;
                    posicionFichaString2 = Integer.toString(posicionFicha2);
                    System.out.println("Jugador 2 : Has subido por una escalera y por tanto avanzas 5 casillas");
                } else if (posicionFichaString2 == "s") {
                    posicionFicha2 -= 5;
                    posicionFichaString2 = Integer.toString(posicionFicha2);
                    System.out.println("Jugador 2 : Te ha mordido la serpiente y por tanto desciendes 5 casillas");
                }

            } else {
                System.out.println("Jugador 2 : ¡Te has pasado!, debes acabar en la casilla exacta");
            }

            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[0].length; j++) {

                    if (posicionFichaString1.equals(posicionFichaString2) && tablero[i][j].equals(posicionFichaString1)) {
                        aux1 = tablero[i][j];
                        aux2 = tablero[i][j];
                        tablero[i][j] = "ox";
                        fila1 = i;
                        columna1 = j;
                        fila2 = i;
                        columna2 = j;
                    } else {
                        if (tablero[i][j].equals(posicionFichaString1)) {
                            aux1 = tablero[i][j];
                            tablero[i][j] = "o";
                            fila1 = i;
                            columna1 = j;
                        }
                        if (tablero[i][j].equals(posicionFichaString2)) {
                            aux2 = tablero[i][j];
                            tablero[i][j] = "x";
                            fila2 = i;
                            columna2 = j;
                        }
                    }
                }
            }

            mostrarTablero(tablero);

            tablero [fila1] [columna1] = aux1;
            tablero [fila2] [columna2] = aux2;

            turno++;

        } while (posicionFicha1 < tamañoTablero && posicionFicha2 < tamañoTablero);

        if (posicionFicha1 == posicionFicha2 ) {
            System.out.println("¡Ha habido un empate!, ambos jugadores habeis terminado en " + turno + " turnos");
        } else if (posicionFicha1 > posicionFicha2) {
            System.out.println("Ha ganado el jugador 1 en " + turno + " turnos");
        } else {
            System.out.println("Ha ganado el jugador 2 en " + turno + " turnos");
        }
    }
}
