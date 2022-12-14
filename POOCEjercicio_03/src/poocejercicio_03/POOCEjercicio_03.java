
package poocejercicio_03;

import Servicio.Servicio;
import java.util.Scanner;


public class POOCEjercicio_03 {

    
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in).useDelimiter("\n");
         Servicio serv = new Servicio();
         String res;
    
     do{
         serv.crearAlumno();
         System.out.println("Desea agregar a otro alumno?");
         res = input.next();
        
     }while(res.equals("Si"));
     
        serv.mostrarLista();
        serv.Nota();
       
    }
    
}
