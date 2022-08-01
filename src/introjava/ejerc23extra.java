/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con un
número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random(). 
 */
package introjava;

import java.util.Scanner;

public class ejerc23extra {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int [][]matriz=new int[20][20];
        int i,j;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz.length;j++){
                matriz[i][j]=(int)(Math.random()*9);
                System.out.print(matriz[i][j]+ "|");
        
            }            
            System.out.println(" ");
            }


    }
    public static int creovector(){
        
        return 0;  
    }
}