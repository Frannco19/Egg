package javaguia11_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaGuia11_03 {

    public static void main(String[] args) {

        /*
        Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
         */
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        try {
            System.out.println("Ingrese el numero 1 :");
            String num1 = input.next();

            System.out.println("Ingrese el numero 2 :");
            String num2 = input.next();

            int num01 = Integer.parseInt(num1);
            int num02 = Integer.parseInt(num2);

            System.out.println(num01 / num02);

        } catch (ArithmeticException | NumberFormatException | InputMismatchException e) {
            System.out.println(e.getMessage());
            
            
        } 
            /*
             Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
             */

            
        

    }

}
