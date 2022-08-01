/*Los profesores del curso de programación de Egg necesitan llevar un registro de
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
cada nota son:
*Primer trabajo práctico evaluativo 10%
*Segundo trabajo práctico evaluativo 15%
*Primer Integrador 25%
*Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.
 */
package introjava;

import java.util.Scanner;

public class ejerc21extra {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double notas;
        int i,j;
        
        double matriz[][]=new double[11][4];
        for (i=1;i<11;i++){
                System.out.println("ingrese las notas del alumno: "+i);
            for(j=0;j<4;j++){
                notas=leer.nextDouble();
                switch(j){
                    case 0:
                        matriz[i][j]=(notas*0.1);
                        break;
                    case 1:
                        matriz[i][j]=(notas*0.15);
                        break;
                    case 2:
                        matriz[i][j]=(notas*0.25);
                        break;
                    case 3:
                        matriz[i][j]=(notas*0.5);                                                                                                
                        break;
                }
            }
        }
        for (i=1;i<11;i++){
            
            for(j=0;j<4;j++){
                System.out.print(matriz[i][j]+"|");
            }
            System.out.println("");
        }
        double promedio;
        int aprobado=0,desaprobado=0;
        for (i=1;i<11;i++){
            promedio=0;
            for(j=0;j<4;j++){
                promedio+=matriz[i][j];
            
            }
            if(promedio>=7){
                aprobado++;
            }else{
                desaprobado++;
            }    
            System.out.println("el promedio del alumno: "+i+" es "+promedio);
        }
            System.out.println("la cantidad de alumnos aprobados es: "+aprobado);    
            System.out.println("la cantidad de alumnos desaprobados es: "+desaprobado);    
                
            
         
    }
    
}
