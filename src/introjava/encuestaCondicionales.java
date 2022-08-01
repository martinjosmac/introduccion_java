/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class encuestaCondicionales {    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner (System.in);
        System.out.println("califique la pelicula del 1 al 5: ");
        opinion = leer.nextInt();
         
        if (opinion<=5 && opinion>=1){
            switch (opinion){
                case 1 :
                case 2 :
                    System.out.println("nos sentimos apenados que no hayas disfrutado la pelicula");
                    break;
                case 3 :
                    System.out.println("has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("has calificado la peli como muy buena");
                    break;
                case 5:
                    System.out.println("fantastico que hayas disfrutado la pelicula");
                    break;
            }
        } else if (opinion <0) {
            System.out.println("una opninion negativa?, tan mala fue la pelicula?");
        }else if (opinion ==0) {
            System.out.println("el valor de " + opinion+ " no es valido y no se tomara en cuenta");
        }else {
            System.out.println(opinion+ " wow! se te fue la mano con la calificacion");
        }           
            System.out.println("hasta la proxima");
        // TODO code application logic here
    }
}
    

