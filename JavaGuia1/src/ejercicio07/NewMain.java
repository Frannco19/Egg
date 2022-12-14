/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

import java.util.Scanner;

/**
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 * @author Franco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese frase :");
        String frase = input.next();
        if ("eureka".equals(frase) ||"EUREKA".equals(frase) ){
            System.out.println("CORRECTO");
        } else {
           
            System.out.println("INCORRECTO");
                    }
    }
    }
    

