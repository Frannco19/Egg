/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

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
        System.out.println("Ingrese una cantidad de graods centigrados :");
        double gradosC = input.nextDouble();
        double gradosF = 32 + (9 * gradosC / 5);
        
        System.out.println("La cantidad de grados centigraods " +gradosC + "Es en grados " +gradosF + "Fahrenheit.");
    }
    
}
