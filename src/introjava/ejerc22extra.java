/*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.
 */
package introjava;

import java.util.Scanner;

public class ejerc22extra {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);   
           
        int n=(int)(Math.random()*10),i,j,suma=0;//creo y tipo de datos de las variables
        int m=(int)(Math.random()*10);
        int matriz[][]= new int[n][m];//creo la matriz
        for(i=0;i<n;i++){                           //relleno la matriz con numeros al azhar
            for(j=0;j<m;j++){
             matriz[i][j]=(int)(Math.random()*50);   
            }
    }
            for(i=0;i<n;i++){                           //muestro la matriz y realizo la suma de sus elementos
                for(j=0;j<m;j++){
                    System.out.print(matriz[i][j]+",");
                    suma+=matriz[i][j];
                }
            System.out.println(" ");
        }
                System.out.println(suma);
        
    }
    
}
 