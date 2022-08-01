/*Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */
package introjava;

import java.util.Scanner;

public class ejerc17extra {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n;
        System.out.println("ingrese un numero para saber si es primo ");
        n=leer.nextInt();
        System.out.println(primo(n));//creo la funcion
    }
    public static boolean primo(int n){
        return n%n==0&&n%1==0&&n%2!=0&&n%3!=0||n==3||n==2;//por ser booleano,no hace falta realizar un condicional 
        
            
        
            
            
            
    }
    
}
