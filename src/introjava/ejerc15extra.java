/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main
 */
package introjava;

import java.util.Scanner;

public class ejerc15extra {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese 2 numeros");
        double a=leer.nextInt();
        double b=leer.nextInt();
        String operacion;
        System.out.println("elija la operacion que desea realizar");
        System.out.println("menu");
        System.out.println("1 sumar");
        System.out.println("2 restar");
        System.out.println("3 multiplicar");
        System.out.println("4 dividir");
        operacion=leer.next();
        switch(operacion){
            case "1":
                System.out.println(suma(a,b));
                break;
            case "2":
                System.out.println(resta(a,b));
                break;
            case "3":
                System.out.println(multip(a,b));
                break;
            case "4":
                System.out.println(div(a,b));
                break;
        }
        
    }
    public static double suma(double a,double b){
        double x=b+a;
                return x;
    }
    public static double resta(double a,double b){
        double x=a-b;
                return x;
    }
    public static double multip(double a,double b){
        double x=b*a;
                return x;
    }    
    public static double div(double a,double b){
        double x=a/b;
                return x;
    }
    
}
