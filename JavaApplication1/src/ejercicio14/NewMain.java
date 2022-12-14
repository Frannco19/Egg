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
        System.out.println("Ingrese la cantidad de compañeros en el equipo :");
        int n = input.nextInt();
        String vectorEquipo[];
        vectorEquipo = new String[n];
        
      for (int i =0; i<n; i++){
         
         System.out.println("Ingrese los nombres :");
        vectorEquipo[i] = input.next();
      }
    }

    
}
