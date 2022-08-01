/*Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general
 */
package introjava;

import java.util.Scanner;

public class ejerc6extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int personsas;
        double atura;
        double promedio;
        System.out.println("ingrese cantidad de peronas");
        personsas = leer.nextInt();
        do {
            System.out.println("ingrese altura: ");
            atura = leer.nextDouble();
            personsas--;
        } while (personsas > 0);

    }
}

