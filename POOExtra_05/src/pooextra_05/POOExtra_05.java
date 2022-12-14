package pooextra_05;

import java.util.Scanner;

public class POOExtra_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto;
        mesSecreto = mes[(int)(Math.random()*11)];
        boolean band = false;
        String mesSecre;
        do {
            System.out.println("Adivine el mes secreto :");
            mesSecre = input.next();
            if (mesSecre.equals(mesSecreto)) {
                System.out.println("Adivinaste el mes secreto!");
                band = true;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");

            }
        } while (!band);
    }

}
