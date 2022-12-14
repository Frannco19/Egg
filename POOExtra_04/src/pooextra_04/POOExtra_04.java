
package pooextra_04;

import Entidad.Nif;
import Service.Servicio;


public class POOExtra_04 {

   
    public static void main(String[] args) {
     
       Servicio servicio = new Servicio();
       Nif nif1 = servicio.crearNif();
       servicio.mostrar(nif1);
      
       
    }
    
}
