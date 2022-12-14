/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

import java.util.Scanner;

/**
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 * @author Franco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in).useDelimiter("\n");
          int num;
          int max=0;
          int min =0;
          int prom=0;
          int cont = 0;
          System.out.println("Ingrese la cantidad de numeros a ingresar :");
          num = input.nextInt();
          do {   
             cont = cont +1;
              prom= prom+num;
              System.out.println("Ingrese numeros");
              int numeros = input.nextInt();
             if (num>max){
                 max=num;
             }else if (num<min){
                 min = num;
             }else{
                 System.out.println("Numeros limite ingresados");
             }
            
          }while (num>0 && num=cont);
          System.out.println("El numero maximo ingresado es :" + max);
          System.out.println("El numero minimo ingresado es :" + min);
          System.out.println("El promedio de los numeros ingresados es :" + prom);
          }
    }
    


