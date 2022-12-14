package pooejercicio_05;

import Entidad.Cuenta;
import Service.Servicio;


public class POOEjercicio_05 {

    
    public static void main(String[] args) {
       Cuenta cuenta1 = new Cuenta();
       Servicio service = new Servicio();
       
       service.crearCuenta(cuenta1);
       service.Menu(cuenta1);
    }
    
}
