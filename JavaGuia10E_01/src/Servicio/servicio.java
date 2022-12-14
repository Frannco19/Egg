
package Servicio;

import Entidad.Alquiler;
import java.time.LocalDate;
import java.util.Scanner;



public class servicio {
    
    Scanner input = new Scanner(System.in);
    
    public Alquiler crearAlquiler(){
        
        Alquiler alquiler = new Alquiler();
        
        System.out.println("Ingresar nombre: ");
        alquiler.setNombre(input.next());
        System.out.println("Ingresar Dni:");
        alquiler.setNumeroDni(input.nextInt());
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el dia de alquiler :");
        int dia = input.nextInt();
        System.out.println("Ingrese el mes de alquiler");
        int mes = input.nextInt();
        System.out.println("Ingreswe el año de alquiler:");
        int anio = input.nextInt();
        System.out.println("Ingrese el dia de Devolucion :");
        int dia2 = input.nextInt();
        System.out.println("Ingrese el mes de Devolucion :");
        int mes2 = input.nextInt();
        System.out.println("Ingreswe el año de Devolucion :");
        int anio2 = input.nextInt();
        alquiler.setFechaDeDevolucion(LocalDate.of(anio2, mes2, dia2));
        System.out.println(" ingrese posicion");
        alquiler.setPosicionAmarre(input.nextInt());

        elegirBarco();

        return alquiler;
       return alquiler; 
    }
     public LocalDate ingresarFecha(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el dia de alquiler :");
        int dia = input.nextInt();
        System.out.println("Ingrese el mes de alquiler");
        int mes = input.nextInt();
        System.out.println("Ingreswe el año :");
        int anio = input.nextInt();
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        return fecha;
        
     }  
}
