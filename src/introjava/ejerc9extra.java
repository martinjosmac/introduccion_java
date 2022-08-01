/*Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3
 */
package introjava;

import java.util.Scanner;

public class ejerc9extra {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int a,b,c=0,suma=0;
        System.out.println("ingrese 2 numeros enteros para realializar una division");
        a=leer.nextInt();
        b=leer.nextInt();
        do{
            a=a-b;
            suma++;
        }while(a>=b);
        System.out.println("el residuo de la division es: " +a);
        System.out.println("el cociente de la division es: "+suma  );
                
        
    }
    
}
