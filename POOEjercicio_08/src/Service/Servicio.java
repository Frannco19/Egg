package Service;

import Entidad.Cadena;
import java.util.Scanner;

public class Servicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Cadena cadena) {
        int cont = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {

            switch (cadena.getFrase().substring(i, i + 1)) {
                case "a":
                    cont++;
                    break;
                case "e":
                    cont++;
                    break;
                case "i":
                    cont++;
                    break;
                case "o":
                    cont++;
                    break;
                case "u":
                    cont++;
                    break;

            }

        }
        System.out.println("La cabtidad de vocales que tiene la frase es :" + cont);
    }

    public void invertirFrase(Cadena cadena) {
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {

            System.out.print(cadena.getFrase().substring(i, i + 1));

        }
        System.out.println(" ");
    }

    public void vecesRepetido(Cadena cadena) {
        int cont = 0;
        System.out.println("Ingrese un caracter :");
        String letra = input.next();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().substring(i, i + 1).equals(letra)) {
                cont++;
            }

        }
        System.out.println("La cantidad de veces que se repite la letra ingresada es : " + cont);

    }

    public void compararLongitud(Cadena cadena) {
        int long2;
        System.out.println("Ingrese otra frase :");
        String frase2 = input.next();
        long2 = frase2.length();
        System.out.println("La longitud de la frase 1 es : " + cadena.getLongitud() + " Mientras que la longitud de la frase 2 es :" + long2);

    }

    public void unirFrases(Cadena cadena) {
        System.out.println("Ingrese una frase :");
        String frase3 = input.next();
        System.out.println("Las frases concatenadas es :" + cadena.getFrase() + " " + frase3);

    }

    public void reemplazar(Cadena cadena) {
        System.out.println("Ingrese la nueva letra :");
        String letra2 = input.next();
        String nuevaFrase = "";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().substring(i, i + 1).equals("a")) {
                nuevaFrase = nuevaFrase.concat(letra2);

            } else {
                nuevaFrase = nuevaFrase.concat(cadena.getFrase().substring(i, i + 1));
            }
        }

        System.out.println("La nueva frase es :" + nuevaFrase);
    }

    public boolean contiene(Cadena cadena) {
        System.out.println("Ingrese una letra :");
        String letra3 = input.next();
        return cadena.getFrase().contains(letra3);
    }
}
