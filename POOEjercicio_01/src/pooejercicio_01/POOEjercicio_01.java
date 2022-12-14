package pooejercicio_01;

import Libro.Libro;
import ServicioLibro.ServicioLibro;

public class POOEjercicio_01 {

    public static void main(String[] args) {
        
        Libro libro1 = new Libro();
        
        ServicioLibro servicio = new ServicioLibro();
        
        servicio.cargarLibro(libro1);
        
        servicio.mostrarLibro(libro1);
        
    }
    
}
