/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Random;
import java.util.Scanner;

/**
17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
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
        System.out.println("Ingrese el tamaño del vector :");
        int n = input.nextInt();
        int[] vector = new int [n];
        
        for ( int i =0; i<n; i++){
           vector[i]= aleatorio.nextInt(10000)+1;
       }
         for (int i = 0; i < n; i++) {
           System.out.print(vector[i] + "/");
          
     
       }
         System.out.println("");
         for (int i = 0; i < n; i++)
           if (vector[i] >0 && vector[i]<10){
           System.out.println("la posicion "  + i+ " tiene un digito");   
           }else if(vector[i]>=10 && vector[i]<100){
               System.out.println("la posicion " +i+ " tiene dos digitos");
           }else if(vector[i]>= 100 && vector[i]<1000){
                System.out.println("la posicion " + i+ " tiene tres digitos");
           }else if (vector[i]>= 1000 && vector[i]<10000){
               System.out.println("la posicion " + i+ " tiene cuatro digitos");
           }else{
              System.out.println("la posicion " + i+ " tiene cinco digitos");
              
                      
        }
    
}
}