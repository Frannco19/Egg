package pooejercicio_11;



import java.util.Date;
import java.util.Scanner;


public class POOEjercicio_11 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el dia :");
        int dia = input.nextInt();
        System.out.println("Ingrese el mes :");
        int mes = input.nextInt();
        System.out.println("Ingrese el año :");
        int anio = input.nextInt();
        
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        Date fechaActual = new Date();
        
        System.out.println(fecha);
        System.out.println(fechaActual);
        System.out.println("La recta de los años es : " + (fechaActual.getYear()-fecha.getYear()));
        
    }
    
}
