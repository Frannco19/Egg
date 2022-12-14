
package eggpoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Servicio {
    
    public static Perro crearPerro(Perro perro){
     Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese Apodo, si tiene cola, peso y raza:");
        perro.setApodo(input.next());
        perro.setCola(input.nextBoolean());
        perro.setPeso(input.nextInt());
        perro.setRaza(input.next());
        
        return perro;
        
    }
    public static void mostrarLista(ArrayList<Perro> perroList){
        
        for (Perro obj : perroList) {
            System.out.println(obj);
            
        }
    }
     public static ArrayList<Perro> eliminarPerro(ArrayList<Perro> perroList, String apodo){
            System.out.println("Eliminamos a chiquito :");
         Iterator it = perroList.iterator();
         while (it.hasNext()){
             Perro obj = (Perro) it.next();
             if (obj.getApodo().equals("Chiquito")){
                 it.remove();
         }
         }      
         return perroList;
        }
}
