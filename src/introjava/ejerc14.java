/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break
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
public class ejerc14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        double a;
        int c;
        double suma;
        c=0;
        suma=0;
        do{
            System.out.println("ingrese un numero");
            a=leer.nextDouble();
            c=c+1;
            
            if (a<0){ 
            
            }else{
                suma=suma+a;
            }
           
        } while ( a != 0 && c<21 );
        System.out.println("se capturo el numero 0");
        System.out.println("la suma de los numeros es "+suma );
    }
    
}
