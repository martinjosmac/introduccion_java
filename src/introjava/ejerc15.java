/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class ejerc15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String sn;
        int opc;
        double a, b;
        System.out.println("ingrese 2 numero ");
        a = leer.nextInt();
        b = leer.nextInt();
        do {
            System.out.println("MENU");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");
            System.out.println("ELIJA OPCION:");
            opc = leer.nextInt();
            if (opc < 5 && opc > 0) {
                switch (opc) {
                    case 1:
                        System.out.println(a + b);
                        break;
                    case 2:
                        System.out.println(a - b);
                        break;
                    case 3:
                        System.out.println(a * b);
                        break;
                    case 4:
                        System.out.println(a / b);
                        break;
                }
            } else {

                System.out.println("esta seguro que desea salir del programa (s/n)");
                sn = leer.next();
                if (sn.equals("s")) {
                }
            }

        } while (opc < 5 && opc > 0);

    }
}
