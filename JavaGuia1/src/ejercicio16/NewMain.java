/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 * @author Franco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Random aleatorio = new Random();
        int num;
  
        System.out.println("Ingrese el tamaño del vector :");
        int n = input.nextInt();
        int[] vector = new int [n];
       
        for (int i = 0; i < n ; i++) {
            vector[i] = aleatorio.nextInt(n)+1;
            
        }
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + "/");
            
        }
        System.out.println("");
        System.out.println("Ingrese un numero para buscar :");
        num = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (vector[i] == num){
                System.out.println("El numero ingresado se encuentra en al posicion " + i);
            }
        }
}
}
