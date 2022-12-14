
package eggpoo;

import java.util.ArrayList;
import java.util.Scanner;

public class EggPOO {

   
    public static void main(String[] args) {
       
        ArrayList<Perro> perroList = new ArrayList();
        
        Perro perro1 = new Perro("Dormilon", 60, true, "chica");
        Perro perro2 = new Perro("Chiquito",100,true,"gigante");
        Perro perro3 = new Perro("Jugueton", 75, false, "mediana");
       
        
        //Le agregamos los atributos al perro1
        //Servicio.crearPerro(perro1);
        
        // Agregamos los obnjetos Perro a una ArrayList de perros
        perroList.add(perro1);
        perroList.add(perro2);
        perroList.add(perro3);
        
        
        
        System.out.println("A continuacion, Mostramos la lista :");
        Servicio.mostrarLista(perroList);
        
        Servicio.eliminarPerro(perroList, "Chiquito");
        System.out.println("Mostramos la lista SIN CHIQUITO :");
        Servicio.mostrarLista(perroList);
        
        
    }
    
}
