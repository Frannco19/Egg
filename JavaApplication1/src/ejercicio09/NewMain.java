/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09;

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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        int suma=0;
        int cont=0;
         do {
            System.out.println("Ingrese 20 numeros: ");
            num = leer.nextInt();
            suma = suma + num ;
            cont = cont + 1;
        } while (num != 0 && cont<20);
         System.out.println("La suma de los numeros ingresados es :"+ suma);
    }
 
}


