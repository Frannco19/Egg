/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import java.util.Scanner;

/**
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 * @author Franco
 */
public class JavaExtras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in).useDelimiter("\n");
         int dias;
         int horas;
         System.out.println("Ingrese un tiempo en minutos :");
         
         int min = input.nextInt();
         input.nextLine();
         horas = min/60;
         dias=min/1440;
         if (horas>24 && dias >=1){
             horas = horas - (24*dias);
             
         }
         System.out.println("Son" + dias + " dia/as y " + horas + " hora/as");
    }
}
