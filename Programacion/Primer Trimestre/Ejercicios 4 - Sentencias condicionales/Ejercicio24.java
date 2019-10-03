import java.util.Scanner;

public class Ejercicio24{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int cargoEmpleado, diasViajados, estadoCivil, sueldoBase = 0, dietas, sueldoBruto = 0;
        float retencionIrpf = 0, sueldoNeto = 0, porcentajeRetencion;
        
        System.out.println("1 - Programador junior");
        System.out.println("2 - Programador senior");
        System.out.println("3 - Jefe de proyecto");
        
        System.out.println("Introduzca el cargo (1 - 3): ");
        cargoEmpleado = sc.nextInt();
        
        System.out.println("¿Cúantos días ha estado de viaje vistando clientes?");
        diasViajados = sc.nextInt();
        
        System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado)");
        estadoCivil = sc.nextInt();
        
        dietas = diasViajados * 30;
        
        if(estadoCivil == 1){
            porcentajeRetencion = 0.25f;
        }
        else{
            porcentajeRetencion = 0.20f;
        }
             
        switch(cargoEmpleado){
            
            case 1:
                sueldoBase = 950;
                sueldoBruto = sueldoBase + dietas;
                retencionIrpf = sueldoBruto * porcentajeRetencion;
                sueldoNeto = sueldoBruto - retencionIrpf;
            break;
            
            case 2:
                sueldoBase = 1200;
                sueldoBruto = sueldoBase + dietas;
                retencionIrpf = sueldoBruto * porcentajeRetencion;
                sueldoNeto = sueldoBruto - retencionIrpf;
            break;
            
            case 3:
                sueldoBase = 1600;
                sueldoBruto = sueldoBase + dietas;
                retencionIrpf = sueldoBruto * porcentajeRetencion;
                sueldoNeto = sueldoBruto - retencionIrpf;
            break;
            
        }
        
        System.out.println("Sueldo base " + sueldoBase);
        System.out.println("Dietas ( " + diasViajados + " ) " + dietas);
        System.out.println("--------------------");
        System.out.println("Sueldo bruto " + sueldoBruto);
        System.out.println("Retención IRPF ( " + (porcentajeRetencion * 100) + "% ) " + retencionIrpf);
        System.out.println("--------------------");
        System.out.println("Sueldo neto " + sueldoNeto);
    }
}