/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner (System.in);
        int numeroDatos;
        System.out.println("Ingresar el numero de provincias: ");
        numeroDatos = entrada.nextInt();
        String[] informacion = obtenerDatos(numeroDatos);
        for (int i = 0; i < informacion.length; i++) {
            System.out.printf("Datos ingresado: %s\n", informacion[i]);
        }
    }
    
    public static String[] obtenerDatos(int numero){
        Scanner entrada = new Scanner(System.in);
        String [] arregloResultante = new String[numero];
        String valor;
        for (int i = 0; i < numero; i++) {
            System.out.println("Ingrese nombre de la provincia: ");
            valor = entrada.nextLine();
            arregloResultante[i] = valor;
        }
        return arregloResultante;
    }
    
}
