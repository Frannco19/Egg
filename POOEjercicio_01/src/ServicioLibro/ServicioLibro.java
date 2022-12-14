package ServicioLibro;

import Libro.Libro;
import java.util.Scanner;

public class ServicioLibro {
   Scanner input = new Scanner(System.in).useDelimiter("\n");
   
    public void cargarLibro(Libro lib){
        
        System.out.println("ingrese el isbn :");
        lib.setSBN(input.nextInt());
        System.out.println("Ingrese el titulo :");
        lib.setTitulo(input.next());
        System.out.println("Ingrese el autor :");
        lib.setAutor(input.next());
        System.out.println("Ingrese la cantidad de paginas :");
        lib.setPaginas(input.nextInt());
        
    }
    public void mostrarLibro(Libro lib){
        
        System.out.println("El numero de SBN es :"+lib.getSBN());
        System.out.println("El titulo del libro es :"+lib.getTitulo());
        System.out.println("El autor del libro es :"+lib.getAutor());
        System.out.println("Ingrese la cantidad de hojas :"+lib.getPaginas());
    }
}
