/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.
 */
package introjava;

import java.util.Scanner;

public class ejerc18extra {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,total=0;
        System.out.println("ingrese la cantidad de elementos que tiene el vector");
        n=leer.nextInt();
        int vector[] = new int[n];
        System.out.println("complete el vector");
        for(int i=0;i<n;i++){
            vector[i]=leer.nextInt();
            total+=vector[i];
        } 
        for(int i=0;i<n;i++){
            
        }
        System.out.println("la suma total de los elementos del vector es de: "+total);
    }
    
}
