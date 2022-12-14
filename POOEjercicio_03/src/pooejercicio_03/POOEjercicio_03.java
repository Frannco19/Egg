
package pooejercicio_03;

import Entidad.Operacion;
import Servicio.servicio;

public class POOEjercicio_03 {

  
    public static void main(String[] args) {
       Operacion oper1 = new Operacion();
       servicio Servicio = new servicio();  
       
       Servicio.Operacion(oper1, oper1);
       Servicio.Sumar(oper1, oper1);
       Servicio.Restar(oper1, oper1);
       Servicio.Multiplicar(oper1, oper1);
       Servicio.Dividir(oper1, oper1);
       
       
    }
    
}
