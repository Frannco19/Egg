package Service;

import Entidad.Nif;
import java.util.Scanner;


public class Servicio {
   
    public Nif crearNif(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de DNI :");
        long dni = input.nextLong();
        char letra = calcularLetra(dni);
        return new Nif(dni,letra);
        
    }
    public char calcularLetra(long dni){
        int posicionLetra = (int) (dni % 23);
        char[] vector = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        char letra = vector[posicionLetra];
        System.out.println(posicionLetra);
        return letra;
    }
    public void mostrar(Nif nif){
        System.out.println("El Nif es :" + nif.getDni()+ "-" + nif.getLetra()  );
    }
}
