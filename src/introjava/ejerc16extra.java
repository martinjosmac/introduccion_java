/*Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
“No”
 */
package introjava;

import java.util.Scanner;

public class ejerc16extra {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        encuesta();
    }
    public static void encuesta(){
        Scanner leer= new Scanner(System.in);
        String respuesta;
        int mayor=0,menor=0;
        do{
            System.out.println("ingrese nombre:");
            String nombre=leer.next();
            System.out.println("ingrese la edad");
            int edad=leer.nextInt();
            System.out.println("desea ingresar otro nombre(si/no)");
            respuesta=leer.next();
            if(edad>=18){
                mayor++;
            }else{
                menor++;
            }
        }while(respuesta.equalsIgnoreCase("si"));
                System.out.println("los mayores de edad son: "+mayor);
                System.out.println("los menores de edad son: "+menor);
        
        
        
       
    
        
    } 
    
}
