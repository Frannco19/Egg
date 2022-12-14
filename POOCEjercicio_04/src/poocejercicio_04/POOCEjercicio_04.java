
package poocejercicio_04;

import Entidad.Pelicula;
import Servicioo.Servicio;
import java.util.Scanner;



public class POOCEjercicio_04 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in).useDelimiter("\n");
       Pelicula peli = new Pelicula();
       
       Servicio serv = new Servicio();
       String res;
       do{
         serv.crearPelicula();
         System.out.println("Desea agregar a otra Pelicula?");
         res = input.next();
        
     }while(res.equals("Si"));
       
       serv.mostrarLista();
       System.out.println("-----------------------------");
       serv.listaMayorhora();
       System.out.println("-----------------------------");
       serv.mayortiempo();
       System.out.println("-----------------------------");
       serv.menorTiempo();
       System.out.println("-----------------------------");
       serv.tituloAlfab();
       System.out.println("-----------------------------");
       serv.directorAlfab();
       
    }
    
}
