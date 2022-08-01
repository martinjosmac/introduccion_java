/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.
 */
package introjava;

import java.util.Scanner;

public class ejerc8extra {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int n,total=0,pares=0,impares=0;
        
        do{
        System.out.println("ingrese numero entero");
        n = leer.nextInt();
        if(n>0){
        total++;
        
        if(n%2==0){
            pares++;
            
        }if(n%2==1){
            impares++;
            
        }
        }
        }while(n%5!=0);
        System.out.println("la total de numeros es: "+total);
        System.out.println("la cantidad de numeros pares es: "+pares);
        System.out.println("la cantidad de numeros impares es: "+impares);
    }
    
    
}
