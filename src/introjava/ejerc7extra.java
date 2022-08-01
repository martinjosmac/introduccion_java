/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.

 */
package introjava;

import java.util.Scanner;

public class ejerc7extra {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int canti,n,max=0,min=999,prom,total=0,totalper=0;
        System.out.println("ingrese la cantidad de numeros");
        canti=leer.nextInt();
        System.out.println("ingrese los numeros");
        do{
        n=leer.nextInt();
            total+=n;
            
            canti--;
            totalper++;
            if(n>max){
               max=n;
            }if(n<min){
               min=n;
            }
            
        }while(canti>0);
        System.out.println("el mayor numero es: "+max);
        System.out.println("el menor numero es: "+min);
        System.out.println("el promedio de todos los numeros es: "+total/totalper);
        while(canti>0){
            n=leer.nextInt();
            total+=n;
            
            canti--;
            totalper++;
            if(n>max){
               max=n;
            }if(n<min){
               min=n;
            }
        
        }
        System.out.println("el mayor numero es: "+max);
        System.out.println("el menor numero es: "+min);
        System.out.println("el promedio de todos los numeros es: "+total/totalper);
        
    }
    
    
}
