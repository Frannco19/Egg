/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

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
        System.out.println("Ingrese 2 numeros: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        EsMultiplo(num1,num2);
    }
    public static void EsMultiplo ( int num1, int num2){
        int resto;
        if (num1%num2==0){
            System.out.println("El numero " + num1 + " es multiplo de " + num2);
        } else{
            System.out.println("El numero " + num1 + " no es multiplo de " + num2);
        }
         
        
    }
}
