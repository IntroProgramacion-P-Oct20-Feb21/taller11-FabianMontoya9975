/*
    Generar un procedimiento para calcular el valor de la planilla de luz
    y otro procedimiento para calcular el valor del predio de un bien
    inmueble. Cada procedimiento debe tener 2 parámetros (tipo cadena
    para nombre del cliente, cédula del cliente).
    En el procedimiento de planilla de luz se debe pedir los siguiente
    datos valor del kilowatio y el número de kilowatios del mes.
    Y se presenta en pantalla el siguiente reporte: Cliente Ana Contreras
    con cédula 1100112233 debe cancelar el valor de $10

    En el procedimiento del predio se debe pedir el valor de inmueble y
    el para obtener el valor del predio se saca el 2% del valor del
    inmueble. Y se presenta el siguiente reporte:

    Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble
    valorado en $30000 y tiene que pagar de predio $ 600.

    En el método principal; si el usuario ingresa 1 se llama al
    procedimiento calcularValorLuz; 2 se llama al procedimiento
    calcularPredio. Los datos que se necesita en cada procedimiento
    se los debe ingresar por teclado.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    // Se define la función inicial
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int opcion;
        System.out.println("Ingresar 1 para calcular el valor de la "
                + "planilla de luz\nIngresar 2 para calcular predio de"
                + "un inmueble: ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                // Se llama al procedimiento calcularValorLuz
                calcularValorLuz();
                break;
            case 2:
                // Se llama al procedimiento calcularPredio
                calcularPredio();
                break;
        }
    }
    //Se define el procedimiento para calcular el costo de la planilla de luz
    public static void calcularValorLuz() {
        Scanner entrada=new Scanner(System.in);
        String nombre;
        String cedula;
        double valorKilovatios;
        double kilovatiosMes;
        double valorPanilla;
        System.out.println("Ingresar el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar el numero de cédula del cliente: ");
        cedula = entrada.nextLine();
        System.out.println("Ingresar el valor del kilovatio: ");
        valorKilovatios = entrada.nextDouble();
        System.out.println("Ingresar el número de kilovatios consumidos: ");
        kilovatiosMes = entrada.nextDouble();
        // se calcula el valor de la planilla de luz
        valorPanilla = valorKilovatios * kilovatiosMes;
        System.out.printf("Cliente %s con cédula %s debe cancelar el "
                + "valor de $%.2f\n",
                nombre, cedula, valorPanilla);
    }
    // Se define el procedimiento para calcular el predio del inmueble
    public static void calcularPredio() {
        Scanner entrada=new Scanner(System.in);
        String nombre;
        String cedula;
        double inmueble;
        double total;
        System.out.println("Ingresar el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar el numero de cédula del cliente: ");
        cedula = entrada.nextLine();
        System.out.println("Ingresar el valor del inmueble: ");
        inmueble = entrada.nextDouble();
        // Se calcula el valor del predio a pagar
        total = inmueble * 0.2;
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio $%.2f\n",
                nombre, cedula, inmueble, total);
    }
    
}
