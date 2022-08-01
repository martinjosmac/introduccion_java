/*Escriba  un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicia
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
public class ejerc13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    int a;
    int b;
    int c;
    c=0;
        System.out.println("ingrese un numero valor limite positivo");
        a=leer.nextInt();
        do{
            System.out.println("ingrese un numero");
            b=leer.nextInt();
            c=c+b;
            
            
        } while(c<a) ;
    }
    
}
