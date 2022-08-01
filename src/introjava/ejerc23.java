/*. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz
 */
package introjava;

import java.util.Scanner;

public class ejerc23 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int j,i;
        int matriz[][]= new int [4][4];
        int matrizT[][]= new int [4][4];
        for(i=0;i<4;i++){
         for(j=0;j<4;j++){
             matriz[i][j] = (int)(Math.random()*50);
             System.out.print(matriz[i][j]+",");
         }
            System.out.println(" ");
        }
        System.out.println(" transpuesta");
           
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                 matrizT[j][i]=matriz[i][j];
                
                     
    }
        }
                System.out.println(" ");
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.print(matrizT[i][j]+",");
                
            }   
            System.out.println(" ");
        }
        
    }
}


