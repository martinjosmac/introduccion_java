/*. Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el
vector.
 */
package introjava;

import java.util.Scanner;



public class ejerc20extra {
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("ingrese la cantidad de elementos del array");
        int n =leer.nextInt();
        int i=0;
        int vector[]=new int[n];
        rellenar(vector);
        imprimir(vector);
    }
    public static void rellenar(int []vector){
        for (int i=0;i<vector.length;i++){
            
        vector[i]=(int)(Math.random()*5) ;
        }
        
        
    }
    public static void imprimir(int vector[]){
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+",");
        }
            System.out.println(" ");
    }
}

