/*Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
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
public class ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     // TODO code application logic here
     int num;
        System.out.println("ingrese un numero:");
        num = leer.nextInt();
        System.out.println("el doble del numero es " +2*num);
        System.out.println("el triple del numero es" +3*num);
        System.out.println("la raiz cuadrada del numeroes" +Math.sqrt(num)); 
       
             
    }
    
}
