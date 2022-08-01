/*Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package introjava;

import java.util.Scanner;

public class ejerc19 {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double euro;
       
        System.out.println("ingrese la cantidad de euros que desea convertir");
        
        euro = leer.nextDouble();
        
        double resultado = conversion(euro,"dolares");
        System.out.println(resultado);
        resultado = conversion(euro,"libras");
        System.out.println(resultado);
        resultado = conversion(euro,"yenes");
        System.out.println(resultado);
        
        
    }
    public static double conversion(double euro,String divisas) {
        //logica
        double x=0;
        switch(divisas){
            case "dolares":
                x= euro*1.28611;
                break;
            case "libras":
                x= euro*0.86;
                break;
            case "yenes":
                x= euro*129.852;
                break;
        }
        return x;
    }

       
}

