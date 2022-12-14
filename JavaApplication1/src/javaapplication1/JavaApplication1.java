/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tipos de datos
        
        int numero=10; //Entero
        double numerosReales=2.4; //Numeros Reales
        String cadena="Hola Mundo"; // Cadena tomas uno o varios caracteres
        char letra='a'; //Toma solo una letra 
        boolean logico= true; //Booleano logico V o F
        
        //Escribir
        System.out.println("Hola mundo");
        //Ejemplo (IMPRIME HOLA MUNDO)
        System.out.println(cadena);
        //sout + tab
        System.out.println("");
        //Control + ESPACIO Autocompletar
        //Escribir Sin saltar
        System.out.print("");
        
        //Leer 
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Ingresar un numero //Scanner Leer
        System.out.println("Ingrese un numero Entero");
        int num = leer.nextInt();
        System.out.println("Ingrese un numero Real");
        double numReal = leer.nextDouble();
        System.out.println("Ingrese una cadena ");
        String palabra = leer.next();
        System.out.println("Ingrese un booleano");
        boolean log = leer.nextBoolean();
        
        
        System.out.println("El numero entero es"+ num);
        System.out.println("El numero real es"+ numReal);
        System.out.println("La palabra es "+ palabra);
        System.out.println("El booleano es "+ log);
    }
    
}
