
package poocejercicio_02;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class POOCEjercicio_02 {

    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<String> razas = new ArrayList();
    
    boolean res = true;
    while (res){
        System.out.println("Ingrese la Raza :");
        String raza = input.next();
        razas.add(raza);
        
        System.out.println("Desea Salir ? S/N");
        String resp = input.next();
        if(resp.equals("s")){
            res = false;
        }
        
    }
     System.out.println(razas);
        
        System.out.println("Ingrese la raza que desea eliminar :");
        String eliminado = input.next();
        
        Iterator<String> it = razas.iterator();
        
        while (it.hasNext()){
            if(it.next().equals(eliminado)){
                it.remove();
            }
        }
        System.out.println(razas);
    }
    
}
