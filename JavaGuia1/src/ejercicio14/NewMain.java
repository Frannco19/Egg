/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in).useDelimiter("\n");
         double euros;
         String opcion;
        System.out.println("CAMBIO DE DIVISAS :");
        System.out.println("1.DOLAR ");
        System.out.println("2.YENES ");
        System.out.println("3.LIBRAS ");
        System.out.println("Ingrese la cantidad de euros :");
        euros = input.nextInt();
        System.out.println("Ingrese la moneda a convertir");
        opcion = input.next();
        Convertibilidad(euros,opcion);
    }
    public static void Convertibilidad (double euros, String opcion){
       double dolar;
       double yenes;
       double libras;
        switch (opcion){
            case "dolar":
                dolar = (double) (euros*1.28611);
                System.out.println("La cantidad de euros convertidos a dolares es :" + dolar);
                break;
            case "yenes":
                yenes = (double) (euros*0.86);
                 System.out.println("La cantidad de euros convertidos a yenes es :" + yenes);
                break;
            case "libras":
                libras = (double) (euros *129.852);
                System.out.println("La cantidad de euros convertidos a libras es :" + libras);
        }
    }
}
/* Esta mal, es con funciones*/