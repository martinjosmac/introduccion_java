/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package introjava;

import java.util.Scanner;

public class ejerc22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,suma,suma1,suma2,suma3,suma4;
        suma=0;
        suma1=0;
        suma2=0;
        suma3=0;
        suma4=0;
        String numca;
        System.out.println("ingrese la cantidad de posciones que tendra el vector");
        a=leer.nextInt();
        int[]vector=new int[a];
        for(int i=0;i<a;i++){
            vector[i] = (int) (Math.random()*10000);
            System.out.println(vector[i]);
        }
        
        for(int i=0;i<a;i++){
            numca = String.valueOf(vector[i]);
            if(numca.length()==1){
                suma=suma+1;
        }else if(numca.length()==2){   
            suma1=suma1+1;                
        }else if(numca.length()==3){
            suma2=suma2+1;
        }else if(numca.length()==4){
            suma3=suma3+1;
        }else if(numca.length()==5){
            suma4=suma4+1;
        }
            
        }
                System.out.println("la cantidad de numeros con 1 digitos es: " +suma);    
                System.out.println("la cantidad de numeros con 2 digitos es: " +suma1);
                System.out.println("la cantidad de numeros con 3 digitos es: " +suma2);
                System.out.println("la cantidad de numeros con 4 digitos es: " +suma3);
                System.out.println("la cantidad de numeros con 5 digitos es: " +suma4);
        
    }
    
}
