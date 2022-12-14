package javaguia11_02;

import java.util.ArrayList;
import java.util.Vector;

public class JavaGuia11_02 {

    /**
     * Definir una Clase que contenga algún tipo de dato de tipo array y agregue
     * el código para generar y capturar una excepción
     * ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango).
     */
    public static void main(String[] args) {
        
        try {
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            System.out.println(cars[2]);  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Da error");
        }
                
            
            
    }

}
