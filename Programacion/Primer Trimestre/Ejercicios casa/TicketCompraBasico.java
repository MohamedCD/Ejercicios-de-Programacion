/*

Realizar un programa en Java que solicite interactivamente el nombre,
la cantidad y el precio de 4 productos, así como el tipo de IVA aplicado a cada uno de ellos.

Una vez recogidos los datos, el programa deberá realizar los cálculos necesarios para mostrar
por pantalla un Ticket de la compra.

En dicho ticket se detallará el nombre de cada producto, la cantidad, el precio y el importe
correspondiente al IVA de cada producto (un producto por línea). Después, se deberá indicar el
importe total (sin IVA) y la cantidad correspondiente al IVA. Finalmente, deberá mostrarse el
precio final con iva incluido.

El programa deberá presentar alineados a la izquierda los nombres de los productos, y
alineados a la derecha (en columnas) las cantidades de producto, precios y cantidades
asociadas al IVA. Los precios deberán mostrarse siempre con 2 decimales (céntimos de Euro).
 */
import java.util.*;

public class TicketCompraBasico {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nombrePrimerProducto, nombreSegundoProducto, nombreTercerProducto, nombreCuartoProducto;

        int cantidadPrimerProducto, cantidadSegundoProducto, cantidadTercerProducto, cantidadCuartoProducto;

        float precioPrimerProducto, ivaPrimerProducto, precioSinIvaPrimerProducto, precioIvaPrimerProducto, precioFinalPrimerProducto;

        float precioSegundoProducto, ivaSegundoProducto, precioSinIvaSegundoProducto, precioIvaSegundoProducto, precioFinalSegundoProducto;

        float precioTercerProducto, ivaTercerProducto, precioSinIvaTercerProducto, precioIvaTercerProducto, precioFinalTercerProducto;

        float precioCuartoProducto, ivaCuartoProducto, precioSinIvaCuartoProducto, precioIvaCuartoProducto, precioFinalCuartoProducto;

        float importeFinalSinIva, importeFinalIva, importeFinal;


        System.out.println("Introduce el nombre del primer producto");
        nombrePrimerProducto = sc.nextLine();

        System.out.println("Introduce la cantidad del primer producto");
        cantidadPrimerProducto = sc.nextInt();

        System.out.println("Introduce el precio del primer producto");
        precioPrimerProducto = sc.nextFloat();

        System.out.println("Introduce el IVA aplicado a este producto");
        ivaPrimerProducto = sc.nextFloat() / 100;

        sc.nextLine();

        System.out.println("Introduce el nombre del segundo producto");
        nombreSegundoProducto = sc.nextLine();

        System.out.println("Introduce la cantidad del segundo producto");
        cantidadSegundoProducto = sc.nextInt();

        System.out.println("Introduce el precio del segundo producto");
        precioSegundoProducto = sc.nextFloat();

        System.out.println("Introduce el IVA aplicado a este producto");
        ivaSegundoProducto = sc.nextFloat() / 100;

        sc.nextLine();

        System.out.println("Introduce el nombre del tercer producto");
        nombreTercerProducto = sc.nextLine();

        System.out.println("Introduce la cantidad del tercer producto");
        cantidadTercerProducto = sc.nextInt();

        System.out.println("Introduce el precio del tercer producto");
        precioTercerProducto = sc.nextFloat();

        System.out.println("Introduce el IVA aplicado a este producto");
        ivaTercerProducto = sc.nextFloat() / 100;

        sc.nextLine();

        System.out.println("Introduce el nombre del cuarto producto");
        nombreCuartoProducto = sc.nextLine();

        System.out.println("Introduce la cantidad del cuarto producto");
        cantidadCuartoProducto = sc.nextInt();

        System.out.println("Introduce el precio del cuarto producto");
        precioCuartoProducto = sc.nextFloat();

        System.out.println("Introduce el IVA aplicado a este producto");
        ivaCuartoProducto = sc.nextFloat() / 100;


        precioSinIvaPrimerProducto = cantidadPrimerProducto * precioPrimerProducto;
        precioIvaPrimerProducto = precioSinIvaPrimerProducto * ivaPrimerProducto;
        precioFinalPrimerProducto = precioIvaPrimerProducto + precioSinIvaPrimerProducto;

        precioSinIvaSegundoProducto = cantidadSegundoProducto * precioSegundoProducto;
        precioIvaSegundoProducto = precioSinIvaSegundoProducto * ivaSegundoProducto;
        precioFinalSegundoProducto = precioIvaSegundoProducto + precioSinIvaSegundoProducto;

        precioSinIvaTercerProducto = cantidadTercerProducto * precioTercerProducto;
        precioIvaTercerProducto = precioSinIvaTercerProducto * ivaTercerProducto;
        precioFinalTercerProducto = precioIvaTercerProducto + precioSinIvaTercerProducto;

        precioSinIvaCuartoProducto = cantidadCuartoProducto * precioCuartoProducto;
        precioIvaCuartoProducto = precioSinIvaCuartoProducto * ivaCuartoProducto;
        precioFinalCuartoProducto = precioIvaCuartoProducto + precioSinIvaCuartoProducto;

        importeFinalSinIva = precioSinIvaPrimerProducto + precioSinIvaSegundoProducto + precioSinIvaTercerProducto + precioSinIvaCuartoProducto;
        importeFinalIva = precioIvaPrimerProducto + precioIvaSegundoProducto + precioIvaTercerProducto + precioIvaCuartoProducto;
        importeFinal = importeFinalSinIva + importeFinalIva;


        System.out.printf("\n%-10s %5s %.2f%s %.2f%s %.2f%s %.2f%s\n", nombrePrimerProducto, cantidadPrimerProducto, precioPrimerProducto, "€", ivaPrimerProducto * precioPrimerProducto, "%", precioSinIvaPrimerProducto, "€", precioIvaPrimerProducto, "€");
        System.out.printf("%-10s %5s %.2f%s %.2f%s %.2f%s %.2f%s\n", nombreSegundoProducto, cantidadSegundoProducto, precioSegundoProducto, "€", ivaSegundoProducto * precioSegundoProducto, "%", precioSinIvaSegundoProducto, "€", precioIvaSegundoProducto, "€");
        System.out.printf("%-10s %5s %.2f%s %.2f%s %.2f%s %.2f%s\n", nombreTercerProducto, cantidadTercerProducto, precioTercerProducto, "€", ivaTercerProducto * precioTercerProducto, "%", precioSinIvaTercerProducto, "€", precioIvaTercerProducto, "€");
        System.out.printf("%-10s %5s %.2f%s %.2f%s %.2f%s %.2f%s\n", nombreCuartoProducto, cantidadCuartoProducto, precioCuartoProducto, "€", ivaCuartoProducto * precioCuartoProducto, "%", precioSinIvaCuartoProducto, "€", precioIvaCuartoProducto, "€");

        System.out.println("---------------------------------");

        System.out.printf("%-10s %.2f %s\n", "Importe total sin IVA: ",importeFinalSinIva, "€");
        System.out.printf("%-10s %.2f %s\n", "Importe total del IVA: ", importeFinalIva, "€");
        System.out.printf("%-10s %.2f %s\n", "Precio final: ", importeFinal, "€");

    }
}
