/*
    Generar un procedimiento (método que no devuelva valor) que imprima
    los valor pares de un arreglo bidimensional.

    El arreglo para probar la solución es:
    int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

    El procedimiento o método debe se invocado desde el método
    main (principal); además el método debe recibir como parámetro
    un arreglo bidimensional.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    // Se define la función inicial
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        // Se llama al procedicimiento imprimirValores y se le envia un arreglo
        imprimirValores(informacion);
    }
    // Se define el procedimiento Para imprimir los valores
    public static void imprimirValores (int[][] valores){
        String cadena = "";
        for (int fila = 0; fila < valores.length; fila++){
            for (int columna = 0; columna < valores[fila].length; columna++) {
                cadena = String.format("%s[%d][%d] = %d\n",
                        cadena,
                        fila,
                        columna,
                        valores[fila][columna]);
            }
        }
        System.out.printf("%s", cadena);
    }
}
