/*
5. Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.
 */
package introjava;

import java.util.Scanner;

public class ejerc5extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);   
        System.out.println("ingrese su cobertura (A,B,C: ");
        String cobertura=leer.next();
        cobertura=cobertura.toUpperCase();
        System.out.println("ingrese el valor de su tratamiento");
        double valor=leer.nextInt();
        switch(cobertura){
            case "A":
                System.out.println("el valor del tratamiento con su descuento de cobertura tipo A es de: "+valor*0.5);
                break;
            case"B":
                System.out.println("el valor del tratamiento con su descuento de cobertura tipo B es de: "+valor*0.65);
                break;
            case "C":
                System.out.println("el valor del tratamiento con su descuento de cobertura tipo C es de: "+valor);
                break;
                
                    
                
        }
    }
    
}
