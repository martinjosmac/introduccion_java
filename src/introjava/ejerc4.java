/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class ejerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         
         double centi,far;
        
         System.out.println("ingrese la temperatura en grados centigrados");
         
         centi=leer.nextDouble();
         
         far = 32+( 9*centi/5);
         
         System.out.println("la temperatura es fahrenheit es de " + far); 
                 
    }
    
}
