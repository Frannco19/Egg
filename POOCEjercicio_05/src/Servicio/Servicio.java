package Servicio;

import Entidad.Pais;
import java.util.*;

public class Servicio {

    private final Scanner input;
    private final HashSet<Pais> pais;

    public Servicio() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.pais = new HashSet<Pais>();
    }

    public Pais añadirPais() {

        Pais pais1 = new Pais();
        
        System.out.println("Ingrese un pais :");
        String jas = input.next();
        pais1.setPais(jas);

        pais.add(pais1);

        return pais1;

    }

    public void eliminarPais() {

        Iterator<Pais> it = pais.iterator();
        boolean paisborrado = false;
        System.out.println("Ingrese el pais que desee eliminar :");
        String aux = input.next();
        while (it.hasNext()) {
            if (it.next().getPais().equals(aux)) {
                it.remove();
                System.out.println("Se ah eliminado el pais ingresado");
                paisborrado = true;
                break;
                
            }  
            
        }
        if (paisborrado == false) {
                System.out.println("No se encontro el pais que deseo eliminar");
            }
       
       
    }
    public void mostrarPais(){
        for (Pais var : pais){
            System.out.println(var);
        }
    }
}