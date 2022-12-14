
package pooejercicio_04;

import Entidad.Rectangulo;
import Servicio.servicio;

public class POOEjercicio_04 {

    
    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo();
        
        servicio Service = new servicio();
        
        Service.crearRectangulo(rec1, rec1);
        Service.Superficie(rec1, rec1);
        Service.Perimetro(rec1, rec1);
        Service.DibujarRectangulo(rec1, rec1);
    }
    
}
