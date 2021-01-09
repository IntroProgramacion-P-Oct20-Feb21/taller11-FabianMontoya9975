/*
    Generar una solución que implemente 3 procedimientos.
    Que permitan calcular el área de un cuadrado, área de un triángulo
    y área de un rectángulo. Cada procedimiento debe solicitar los
    datos necesarios y presentar o imprimir el valor correspondiente.
    Se debe invocar a los procedimientos desde un método principal;
    Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado;
    2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama al
    procedimiento obtenerAreaRectangulo.
    
    El área del cuadrado es igual a lado x lado
    El área del triángulo es igual a (base x altura)/2
    El área del rectángulo es igual a base x altura
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Ingresar 1 para calcular el área de un cuadrado"
                + "\nIngresar 2 para calcular el área de un triángulo\n"
                + "Ingresar 3 para calcular el área de un rectángulo: ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                obtenerAreaCuadrado();
                break;
            case 2:
                obtenerAreaTriangulo();
                break;
            case 3:
                obtenerAreaRectangulo();
                break;
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
        System.out.println("Ingresar el valor de un lado del cuadrado: ");
        lado = entrada.nextDouble();
        area = lado * lado;
        System.out.printf("El área del cuadrado es: %f\n", area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingresar el valor de la base del triángulo: ");
        base = entrada.nextDouble();
        System.out.println("Ingresar el valor de la altura del triángulo: ");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("El área del triángulo es: %f\n", area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingresar el valor de la base del rectángulo: ");
        base = entrada.nextDouble();
        System.out.println("Ingresar el valor de la altura del rectángulo: ");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.printf("El área del rectángulo es: %f\n", area);
    }

}
