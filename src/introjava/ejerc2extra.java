/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.
 */
package introjava;

import java.util.Scanner;

public class ejerc2extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a=5,b=2,c=7,d=9,e;
        System.out.println(a+"A,"+b+"B,"+c+"C,"+d+"D,");
        
        e=b;
        b=c;
        c=a;
        a=d;
        
        d=e;
        
        System.out.println(b+"B,"+c+"C,"+a+"A,"+d+"D,");
        
              
    }
    
}
