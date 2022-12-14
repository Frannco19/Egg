package poocejercicio_05;

import Entidad.Pais;
import Servicio.Servicio;
import java.util.Scanner;

public class POOCEjercicio_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        Servicio serv = new Servicio();

        String res;
        do {
            serv.añadirPais();
            System.out.println("Desea agregar otro Pais?");
            res = input.next();
            
        } while (res.equals("Si"));

        serv.eliminarPais();
        serv.mostrarPais();
        
    }

}
