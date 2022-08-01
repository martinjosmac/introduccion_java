/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
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
public class ejerc18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        int a,i,j,suma;
        suma=0;
        System.out.println("ingrese 4 numeros comprendidos entre 1 y 20");
        do{
        System.out.println(" ");
        a=leer.nextInt();
            
        if (a<21 && a > 0){
        suma = suma + 1;
        
            System.out.print(a);
            for( i = 0; i<=a-1 ; i++){
                System.out.print("*");
               
            }
        }
         } while (suma < 4);
        System.out.println(" ");
                    
        
    }
    
}
