
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;


public class Servicio {
   public Persona crearPersona(){
         Scanner input = new Scanner(System.in).useDelimiter("\n");
         System.out.println("Ingrese nombre :");
         String nombre = input.next();
         System.out.println("Ingrese su fecha de nacimiento : 1)Año");
         int anio = input.nextInt();
         System.out.println("2)Mes :");
         int mes = input.nextInt();
         System.out.println("3) Dia :");
         int dia = input.nextInt();
         
         Date fechaNacimiento = new Date(anio-1900,mes-1,dia);
         return new Persona(nombre,fechaNacimiento);
         
   }
    public void calcularEdad (Persona pers){
        Date fechaActual = new Date();
        System.out.println("La recta de los años es : " + (fechaActual.getYear()-pers.getFechaNacimiento().getYear()));
        
    }
    public void mostrarPersona(Persona pers){
        System.out.println(""+pers.toString());
    }
}
 
