/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */
package introjava;

import java.util.Scanner;


public class ejerc17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int c,n;
        
        System.out.println("ingrese un numero:");
        
        n=leer.nextInt();
        
        
       if(n>= 0 && n<=50) {
            //Linea superior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
           
            //centro de la forma
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
           
            //Linea inferior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }else {
            System.out.println("Error. El dato a ingresar de "
                    + "estar entre 0 y 50");
        }
               
 
    }
}
                    
                
                
               
                               
        
                
            
        
    

