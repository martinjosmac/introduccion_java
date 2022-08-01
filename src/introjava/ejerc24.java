/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa)

 */
package introjava;

import java.util.Scanner;

public class ejerc24 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int j,i;
        int matriz[][]= new int [4][4];
        int matrizT[][]= new int [4][4];
        for(i=0;i<4;i++){
         for(j=0;j<4;j++){
             matriz[i][j] = (int)(Math.random()*-5);
             System.out.print(matriz[i][j]+",");
         }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Transpuesta");
           
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
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){                 
                 if(matrizT[i][j]==-(matriz[i][j])){;
                 
                 System.out.println("la matriz es anti simetrica");
            }else{
                    }
                    System.out.println("la matriz no es anti simetrica");
            }
        }
    }
}
