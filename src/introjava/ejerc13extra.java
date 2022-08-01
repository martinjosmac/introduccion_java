/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
todas las familias.
 */
package introjava;
 
import java.util.Scanner;

public class ejerc13extra {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double hijos=0,familia,canHijos,edad,i,j,totalH=0,totaledad=0;
        System.out.println("ingrese la cantidad de familias");
        familia=leer.nextDouble();
        while(familia >0){
            System.out.println("cantidad de hijos");
            canHijos=leer.nextDouble();
            familia--;
            hijos+=canHijos;
            totalH+=canHijos;//
        }
        while(hijos>0){
            System.out.println("edades: ");
            edad=leer.nextDouble();
            hijos--;
            totaledad+=edad;
        }
            
        System.out.println("promedio: "+totaledad/totalH);
                
            
            
    }
    
    
}
