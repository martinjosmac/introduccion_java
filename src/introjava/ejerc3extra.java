/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String. 
 */
package introjava;

import java.util.Scanner;

public class ejerc3extra {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);   
     String letra;   
     System.out.println("ingrese una letra para saber si es una vocal");
        letra=leer.next();
        if(letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")) {
            System.out.println("la letra es una vocal");
        
        } else {
            System.out.println("la letra no es una vocal");
        }
         }
    
}
