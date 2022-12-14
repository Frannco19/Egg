package pooejercicio_12;

import Entidad.Persona;
import Service.Servicio;
import java.util.Scanner;


public class POOEjercicio_12 {

  
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        Servicio pers = new Servicio();
        Persona persona1 = pers.crearPersona();
       
        System.out.println(persona1);
        
        pers.calcularEdad(persona1);
        System.out.println("Edad nueva :");
        int Edad = input.nextInt();
        System.out.println(persona1.menorQue(Edad));    
        pers.mostrarPersona(persona1);
    }
}
