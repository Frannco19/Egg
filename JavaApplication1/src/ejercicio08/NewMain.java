/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08;

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
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entre 0 y 10: ");
        numero = leer.nextInt();
        while (numero<0 || numero >10){
            System.out.println("El numero ingresado no esta entre 0 y 10");
            numero = leer.nextInt();

        }
     System.out.println("El numero ingresado esta entre 0 y 10");
    }
    
}
