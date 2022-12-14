/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 * @author Franco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero limite positivo :");
        int numl = input.nextInt();
        int suma=0;
        do {
            System.out.println("Ingrese numeros :");
            int num = input.nextInt();
            
            suma = suma + num;
            
        } while (suma<numl);
         System.out.println("Los numeros ingresados superan el limite inicial y la suma es :" + suma);
        }
        }
        
        
        
    
    

