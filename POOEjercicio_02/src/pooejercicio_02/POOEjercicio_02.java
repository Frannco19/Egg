
package pooejercicio_02;

import Entidad.Circunferencia;
import ServicioCircunsferencia.Servicio;


public class POOEjercicio_02 {

    
    public static void main(String[] args) {
       
        Circunferencia cir1 = new Circunferencia();
        
        Servicio servicio = new Servicio();
        
        servicio.crearCircunferencia(cir1);
        servicio.area(cir1);
        servicio.perimetro(cir1);
        
    }
    
}
