/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class ejerc2 {
    
     public static void main(String[] args) {
         String nombre;
         
         Scanner leer = new Scanner(System.in);
         
         System.out.println("ingrese su nombre");
         
         nombre = leer.next();
         
         System.out.println("mi nombre es: " +nombre );
        
     }
    
}
