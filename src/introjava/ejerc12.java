/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta
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
public class ejerc12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una nota");
        nota= leer.nextInt();
         
        do{
            if(nota<0||nota>10){
                System.out.println("ingrese nuevamente la nota");
                nota = leer.nextInt();
                
            }else {
                
            }
            
        }while (nota<0 || nota>10);
        System.out.println("la nota es correcta");
                 
        
        
    }
    
}
