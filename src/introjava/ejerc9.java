/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en
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
public class ejerc9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         String palabra;
         System.out.println("ingrese una palabra");
         palabra = leer.next();
         int a = palabra.length();
         if (a==8 ){
             System.out.println("correcto");
         }else{
             System.out.println("incorrecto");
         }
                  
        // TODO code application logic here
    }
    
}
