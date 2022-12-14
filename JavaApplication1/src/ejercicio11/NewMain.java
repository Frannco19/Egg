/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

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
        System.out.println("Ingrese la frase: ");
        String cadena = input.next();
        
        String retorno;
        retorno = DevolverFrase(cadena);
        System.out.println(retorno);
    }
    public static String DevolverFrase ( String cadena){
        String x = "";
        String nuevo = "";
        for (int i =0; i< cadena.length();i++){
            x = cadena.substring(i,i+1);
            switch (x) {
                case "a": x = "@";
                 break;
                case "e": x = "#";
                 break;
                case "i": x = "$";
                break;
                case "o": x = "%";
                break;
                case "u": x = "*";
                 break;
            }
            nuevo = nuevo.concat(x);
        }
        return nuevo;
    }
}
