
package ServicioCircunsferencia;

import Entidad.Circunferencia;
import java.util.Scanner;


public class Servicio {
private double radio;
    
    public void crearCircunferencia(Circunferencia radio){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio de la circunferencia :");
        radio.setRadio(input.nextDouble());
        
    }
    public void area(Circunferencia radio){
        double area;
        area = Math.PI * Math.pow(radio.getRadio(),2);
        System.out.println("El area es :" + area);
        
        
    }
    public void perimetro(Circunferencia radio){
        double perimetro;
        perimetro = 2 * 3.14* radio.getRadio();
        System.out.println("El perimetro es : " + perimetro);
    }

}
