
package poocejercicio_01;

import java.util.ArrayList;

import java.util.Scanner;


public class POOCEjercicio_01 {

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
        
     
        


}   
       
    
    
}
