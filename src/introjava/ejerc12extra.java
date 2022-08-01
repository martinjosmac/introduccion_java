/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
 */
package introjava;

import java.util.Scanner;

public class ejerc12extra {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String opi,opj,opk;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    opi=String.valueOf(i);
                    opj=String.valueOf(j);
                    opk=String.valueOf(k);
                    
                    if(opj.equals("3")){
                        opj="E";
                    }
                    if(opk.equals("3")){
                        opk="E";
                    if(opi.equals("3")){
                        opi="E";
                    }
                    }
                    System.out.println(opi+"-"+opj+"-"+opk);
            }
            }
        }
    }
    
}
