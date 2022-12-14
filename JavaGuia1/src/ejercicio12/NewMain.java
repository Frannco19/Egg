/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 * @author Franco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in).useDelimiter("\n");
          String frase;
          String primeraletra;
          String ultimaletra;
          int contincorrectas=0;
          int contcorrectas=0;
          boolean FDE = false;
          while (!FDE){
               System.out.println("Ingrese frases :");
               frase = input.next();
               primeraletra = frase.substring(0,1);
               ultimaletra = frase.substring(frase.length() - 1);
             if (frase.length()<5 && ("X".equals(primeraletra) && "O".equals(ultimaletra))){
                 contcorrectas++;
                 
             }  else if ("&&&&&".equals(frase)){
                 FDE = true;
             }else {
                 contincorrectas++;
          }
          }
          System.out.println("La cantidad de frases correctas es : " + contcorrectas);
          System.out.println("La cantidad de frases incorrectas es : " + contincorrectas);
    
    }
}

