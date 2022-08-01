/*Crear un programa que dado un numero determine si es par o impar.

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
public class ejerc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a;
        
        System.out.println("ingrese un numero");
        
        a = leer.nextInt();
        
        if ( a%2 == 0){
            System.out.println("el numero es par");
        }else if( a%2 == 1 ){
            System.out.println("el numero es impar");
        }
         // TODO code application logic here
    }
    
}
