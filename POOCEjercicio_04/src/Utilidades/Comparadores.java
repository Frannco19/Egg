
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;


public class Comparadores {
    
    
    public static Comparator<Pelicula> ordenDuracionDescen = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t1.getHoras().compareTo(t.getHoras());
        }
    };
    
    public static Comparator<Pelicula> ordenDuracionAsscen = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t1.getHoras().compareTo(t.getHoras());
        }
    };
    public static Comparator<Pelicula> tituloAlfabetica = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t1.getTitulo().compareTo(t.getTitulo());
        }
    };
    
     public static Comparator<Pelicula> directorAlfabetica = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t1.getDirector().compareTo(t.getDirector());
        }
    };
}
