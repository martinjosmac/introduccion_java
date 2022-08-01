/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package introjava;

import java.util.Scanner;

public class ejerc25 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println("ingrese numeros del 1 al 9 hasta completar la matriz");
        //creo la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        //escribo la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + ",");
            }
            System.out.println(" ");
        }
        //calculo la diagonal principal, uso condicion si...los indices tienen que ser igual
        int sumadiag = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumadiag = sumadiag + matriz[i][j];
                }
            }
        }
        System.out.println("la suma de la diagnal es: " + sumadiag);
        //calculo la diagonal inversa, uso condicioion la suma de los indices es igual a longitud del indice menos 1
        int diagin = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 2) {
                    diagin += matriz[i][j];
                }
            }
        }
        System.out.println("la suma de la diagonal inversa es: " + diagin);
        //calculo la suma de las filas y las columnas, primero las filas y luego invierto los indices para sumar las columnas
        for (int i = 0; i < 3; i++) {
        int col = 0;
            int fil = 0;
            for (int j = 0; j < 3; j++) {
                fil += matriz[i][j];
                col += matriz[j][i];
            }
            System.out.println("la suma de la fila [" + i + "] es: " + fil);
            System.out.println("la suma de la columna[" + i + "] es es: " + col);
        }
        //creao una funcion para comparar la suma de las columnas filas y diagonales 

    }
}
