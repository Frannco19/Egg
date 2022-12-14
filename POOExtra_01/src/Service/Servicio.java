package Service;

import Entidad.Cancion;
import java.util.Scanner;


public class Servicio {
   
    public void ingresarMusica(Cancion canc){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el titulo de la cancion : ");
        String titulo1 = input.next();
        System.out.println("Ingrese el autor de la cancion : ");
        String autor1 = input.next();
        
        System.out.println("El titulo de la cancion es : " + titulo1);
        System.out.println("El autor de la cancion es : " + autor1);
    }
    
}
