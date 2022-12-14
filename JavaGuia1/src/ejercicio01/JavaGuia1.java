/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class JavaGuia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        // TODO code application logic here
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 numeros");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int suma = num1+num2;
        System.out.println("La suma de los numeros ingresados es " + suma);
    
    }
    
}
