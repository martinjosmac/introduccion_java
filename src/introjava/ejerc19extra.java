/*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package introjava;

import java.util.Scanner;

public class ejerc19extra {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,suma=0;
        System.out.println("ingrese el tamaño de los vectores");
        n=leer.nextInt();
        int vector1[]=new int [n];
        int vector2[]=new int [n];
        for(int i=0;i<n;i++){
            vector1[i]=(int)(Math.random()*5);
            
            System.out.print(vector1[i]+",");
        }
        System.out.println(" ");
        for(int i=0;i<n;i++){
            vector2[i]=(int)(Math.random()*5);
            System.out.print(vector2[i]+",");
    }
        System.out.println(" ");
        for(int i=0;i<n;i++){
            if(vector1[i]==vector2[i]){
                suma++;
                break;
            }
                if(suma==n){
                    System.out.println("son iguales");
                
            }else{
                System.out.println("no son iguales");
                break;
            }
        
        
        }   
    }
}
