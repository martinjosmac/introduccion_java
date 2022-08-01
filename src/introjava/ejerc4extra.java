/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano
 */
package introjava;

import java.util.Scanner;

public class ejerc4extra {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);   
    int n;
        System.out.println("ingrese un numero del 1 al 9 para convertirlo en romano");
        n=leer.nextInt();
    
        if(n>0&&n<9){
        switch(n){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
        }
        } else{
                System.out.println("numero incorrecto,ingrese nuevamente");
                }
    
        }
    
    
}
