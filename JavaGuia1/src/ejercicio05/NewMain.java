/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 * @author Franco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese un numero :");
        int num = input.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        double RaizC = sqrt(num);
        System.out.println("El doble del numero " + num + " es " + doble);
        System.out.println("El triple del numero " + num + " es " + triple);
        System.out.println("La raiz cuadrada del numero " + num + "es " + RaizC);
    }
    
}
