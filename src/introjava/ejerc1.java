/*
 * scribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la sumaTo change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class ejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int numero1,numero2,resultado;
    Scanner leer= new Scanner(System.in);// TODO code application logic here
    System.out.println("ingrese un numero a sumar");
    numero1=leer.nextInt();
    System.out.println("ingrese el otro numero a sumar");
    numero2=leer.nextInt();
    resultado = numero1 + numero2;
    System.out.println (" el resultado de la suma es " +resultado);
            
    
    
    
    }
    
}
