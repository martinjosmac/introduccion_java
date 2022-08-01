/*Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
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
public class ejerc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a;
        int b;
        System.out.println("ingrese 2 numeros");
        a = leer.nextInt();
        b = leer.nextInt();
    
        if(a>b){
        System.out.println(a);
            
        }else if(b>a){
            
            System.out.println(b);
        } 
// TODO code application logic here
    }
    
}
