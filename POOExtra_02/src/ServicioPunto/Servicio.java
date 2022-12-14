package ServicioPunto;

import Entidad.Punto;
import java.util.Scanner;

public class Servicio {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Punto crearPunto() {
        System.out.println("Ingrese la x :");
        int x = input.nextInt();
        System.out.println("Ingrese la y :");
        int y = input.nextInt();

        return new Punto(x, y);

    }
    public int calcular(Punto punto1, Punto punto2){
        int distancia;
        distancia = (int) Math.sqrt(Math.pow((punto2.getX() - punto1.getX()),2 ) + Math.pow((punto2.getY() - punto1.getY()),2));
        return distancia;
    }
}
