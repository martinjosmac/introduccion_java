/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().   
 */
package introjava;

import java.util.Scanner;

public class ejerc16 {
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c,e,b;
        c=0;
        e=0;
        String palab;
         do{
            System.out.println("ingrese una cadena");
            palab=leer.next();
            b=palab.length();
            
            
            if (palab.length()==5 && palab.substring(0,1).equals("x")&&palab.substring(4,5).equals("o")){
                c = c +1;
            }else if (palab.equals("fde")==false){
                e = e+1;
            }
            
        } while(palab.equals("fde")==false); 
           System.out.println("la cantidad de palabras correctas son: " +c);
           System.out.println("la cantidad de palabras incorrectas son: "+e);     
    }
    
} 
