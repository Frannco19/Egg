package pooextra_01;

import Entidad.Cancion;
import Service.Servicio;


public class POOExtra_01 {

    
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        Servicio serv = new Servicio();
        
        serv.ingresarMusica(cancion1);
    }
    
}
