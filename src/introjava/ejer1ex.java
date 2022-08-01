/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.
 */
package introjava;

import java.util.Scanner;


public class ejer1ex {

    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
    int horas,dia,minutos;
    //pido que ingrese la cantidad de minutos por teclado    
    System.out.println("ingrese la cantidad de minutos");
        minutos=leer.nextInt();
        dia = minutos/1440;
        horas=(minutos/60)-(dia*24);
        System.out.println(dia+" dias y "+horas+" horas");
    }
    
}
