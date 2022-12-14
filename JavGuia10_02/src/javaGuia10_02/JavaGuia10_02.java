package javaGuia10_02;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;
import java.util.List;

public class JavaGuia10_02 {

    public static void main(String[] args) {

        List<Electrodomestico> electrodomestico = new ArrayList();

        /*
         "carga= " + carga +  "precio= " + precio + ", peso= " + peso + ", color= " + color + ", consEn= " + consEn + '}';
    }
         */
        Lavadora lava1 = new Lavadora(20, 0, 10, "blanco", 'C');

        Lavadora lava2 = new Lavadora(30, 0, 15, "rojo", 'D');

        /*
        "Televisor{" + "Pulgadas= "  + resolucion + " tdt= " +  tdt + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consEn=" + consEn + '}';
    }
         */
        Televisor telev1 = new Televisor(45, true, 0, 12, "negro", 'E');

        Televisor telev2 = new Televisor(47, false, 0, 11, "blanco", 'C');

        electrodomestico.add(lava1);
        electrodomestico.add(lava2);
        electrodomestico.add(telev1);
        electrodomestico.add(telev2);

        double preciof = 0;

        for (Electrodomestico elec1 : electrodomestico) {
            elec1.precioFinal();
            preciof += elec1.getPrecio();
        }

        System.out.println("El precio total es : " + preciof);
    }

}
