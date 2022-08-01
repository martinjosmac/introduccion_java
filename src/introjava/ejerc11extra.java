/*Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división. Nota: recordar que las variables de tipo entero
truncan los números o resultados.
 */
package introjava;

import java.util.Scanner;

public class ejerc11extra {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int a,digitos,b,total=0;
        System.out.println("ingrese un numero para saber la cantidad de digitos ");
        a=leer.nextInt();
        do{
            
            a=a/10;
            
            total++;
        
        
    }while(a>0);
        System.out.println(total);
        }
}
