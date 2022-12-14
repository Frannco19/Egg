/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

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
        System.out.println("Ingrese 2 numeros: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1>25 && num2 >25) {
            System.out.println("Los 2 numeros son mayores a 25");
        }
        else if (num1 > 25){
             System.out.println("El numero 1 es mayor a 25");
        }
        else if (num2 > 25) {
            System.out.println("El numero 2 es mayor a 25");
        }
        else {
           System.out.println("Ninguno de Los 2 numeros ingresados son mayores a 25");      
                }
    }
}

