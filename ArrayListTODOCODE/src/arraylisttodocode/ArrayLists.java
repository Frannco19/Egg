
package arraylisttodocode;
import java.util.ArrayList;
import java.util.List;


public class ArrayLists {

   
    public static void main(String[] args) {
        
        List<Persona> lista = new ArrayList<Persona> ();
        lista.add(new Persona (1, "Franco", 19));
        lista.add(new Persona (2, "Luis", 10));
        lista.add(new Persona (3, "Jorge", 30));
        lista.add(new Persona (4, "Mateo", 29));
        // recorrer por indice
        System.out.println("------------FOR-------------------");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Pureba :" + lista.get(i).getMombre());
        }
        System.out.println("-----------FOREACH----------------");
        // recorrido foreach
        for(Persona perso: lista){
            System.out.println("Prueba :" + perso.getMombre());
        }
        
    }
    
}
