package pooextra_02;

import Entidad.Punto;
import ServicioPunto.Servicio;


public class POOExtra_02 {

 
    public static void main(String[] args) {
      Servicio service = new Servicio();
      Punto punto1 = service.crearPunto();
      Punto punto2 = service.crearPunto();
      System.out.println(service.calcular(punto1, punto2));
      
        
    }
    
}
