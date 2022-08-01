/*
 */
package introjava;

import java.util.Scanner;
public class ejerc26 {

    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz1[][]=new int [10][10];
        int matriz2[][]=new int [3][3];
        int i,j;
        for(i=0;i<10;i++){
         for(j=0;j<10;j++){
             matriz1[i][j] = (int)(Math.random()*50);
             System.out.print(matriz1[i][j]+",");
         }
            System.out.println(" ");
        }
        System.out.println(" matriz pequeña");
        for(i=0;i<3;i++){
         for(j=0;j<3;j++){
             matriz2[i][j]= (int)(Math.random()*50);
             System.out.print(matriz2[i][j]+ ",");
            }
            System.out.println(" ");
        }            
         for(i=0;i<10;i++){
            for(j=0;j<10;j++){
             
         }
        }
    }   
}
