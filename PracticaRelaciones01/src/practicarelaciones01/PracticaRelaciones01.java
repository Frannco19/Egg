
package practicarelaciones01;

import Entidades.Perro;
import Entidades.Persona;


public class PracticaRelaciones01 {

 
    public static void main(String[] args) {
       
    /*
        Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
        pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
        la clase Persona, la información del Perro y de la Persona.
        */
    //Perro, que tendrá como atributos: nombre, raza, edad y tamaño; 
    
        Perro perro1 = new Perro("Jose", "Yorkshire", 10, "Grande");
        
        Perro perro2 = new Perro("Luis", "bulldog", 20, "Grande");
        //Persona con atributos: nombre, apellido, edad, documento y Perro

        Persona per = new Persona("Jose", "Apellido1", 20, 34355555, perro1);
        
        Persona per1 = new Persona("Danieñ", "Apellido2", 25, 34318955, perro2);
    
        
        System.out.println(per.toString());
        System.out.println(per1.toString());
        
         
    }
    
}
