package pooejercicio_08;

import Entidad.Cadena;
import Service.Servicio;
import java.util.Scanner;

public class POOEjercicio_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Cadena frase1 = new Cadena();
        Servicio service = new Servicio();
        System.out.println("Ingrese una frase :");
        frase1.setFrase(input.next());
        frase1.setLongitud(frase1.getFrase().length());
        service.mostrarVocales(frase1);
        service.invertirFrase(frase1);
        service.compararLongitud(frase1);
        service.unirFrases(frase1);
        service.reemplazar(frase1);
        System.out.println(service.contiene(frase1));
    }

}
