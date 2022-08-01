/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
package introjava;

import java.util.Scanner;

public class ejerc21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,i,buscar;
        int suma=0;
        System.out.println("ingrese el tamaño del vector");
        n=leer.nextInt();
        int[] vector= new int[n];
        for (i=0;i<n;i++){
           vector[i] = (int) (Math.random()*10);
           
            System.out.print(vector[i]+",");
        } 
        System.out.println(" ");    
            System.out.println("ingrese el numero que desea encontrar");
            buscar=leer.nextInt();
            for (i=0;i<n;i++){
            if(buscar==vector[i]){
                System.out.println("el numero se encuentra en el subindice "+i);
                suma=suma+1;
                if (suma>1){
                }
            }
                
        }
                    System.out.println("el numero se encuentra repetido "+suma+" veces");
        System.out.println(" ");
    }
    
}
