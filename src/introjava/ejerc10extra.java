/*Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java
 */
package introjava;

import java.util.Scanner;

public class ejerc10extra {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int a,b,resultado;
        System.out.println("adivine la multiplicacion entre 2 numeros enteros");
        a=(int)(Math.random()*10);
        b=(int)(Math.random()*10);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println("indique el resultado de la multiplicacion");
        do{
            resultado=leer.nextInt();
            if(resultado!=a*b){
            System.out.println("incorrecto, intenta de nuevo");
            } 
        } while(a*b!=resultado);
        System.out.println(resultado+" es correcto");
    }
                
}
   

