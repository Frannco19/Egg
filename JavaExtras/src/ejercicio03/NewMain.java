/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import java.util.Scanner;

/**
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 * @author Franco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in).useDelimiter("\n");
          String letra;
          System.out.println("Ingrese una letra :");
          letra = input.next();
          if (letra.equals("A") ||letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
              System.out.println("Vocal");
          }else{
              System.out.println("No es vocal");
          }
          }
        
    }
    

