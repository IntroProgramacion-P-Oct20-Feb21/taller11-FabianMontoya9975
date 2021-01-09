/*
    Generar una función que tenga 4 parámetros de tipo decimal y devuelva
    el promedio cualitativo de los parámetros. Si el promedio es:
    De 0 a 5 el promedio cualitativo es Regular
    De 5.1 a 8 el promedio cualitativo es Bueno
    De 8.1 a 9 el promedio cualitativo es Muy Bueno
    De 9.1 a 10 el promedio cualitativo es Sobresaliente.
    A la función se la debe llamar desde un método principal.
    Los parámetros necesarios para llamar a la función, deben ser
    ingresados solicitados al usuario. En la función principal se
    debe imprimir los siguiente:
    El promedio de las notas: 10, 5, 8, 7 es Bueno
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        String notaCualitativa;
        System.out.println("Ingresar nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Ingresar nota 2: ");
        nota2 = entrada.nextDouble();
        System.out.println("Ingresar nota 3: ");
        nota3 = entrada.nextDouble();
        System.out.println("Ingresar nota 4: ");
        nota4 = entrada.nextDouble();
        notaCualitativa = obtenerPromedio(nota1, nota2, nota3, nota4);
        System.out.printf("El promedio de las notas: %.1f, %.1f, %.1f, "
                + "%.1f es %s\n",
                nota1, nota2, nota3, nota4, notaCualitativa);
    }

    public static String obtenerPromedio(double a, double b,
            double c, double d) {
        double promedio;
        String promedioCualitativo = "";
        promedio = (a + b + c + d) / 4;
        if ((promedio >= 0) && (promedio <= 5)) {
            promedioCualitativo = "Regular";
        } else {
            if ((promedio >= 5.1) && (promedio <= 8)) {
                promedioCualitativo = "Bueno";
            } else {
                if ((promedio >= 8.1) && (promedio <= 9)) {
                    promedioCualitativo = "Muy bueno";
                } else {
                    if ((promedio >= 9.1) && (promedio <= 10)) {
                        promedioCualitativo = "Sobresaliente";
                    }
                }
            }
        }
        return promedioCualitativo;
    }

}
