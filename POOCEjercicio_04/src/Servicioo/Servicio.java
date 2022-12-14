package Servicioo;

import Entidad.Pelicula;
import static Utilidades.Comparadores.directorAlfabetica;
import static Utilidades.Comparadores.ordenDuracionAsscen;
import static Utilidades.Comparadores.ordenDuracionDescen;
import static Utilidades.Comparadores.tituloAlfabetica;
import java.util.*;

public class Servicio {

    private final Scanner input;
    private final ArrayList<Pelicula> listaPeliculas;

    public Servicio() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.listaPeliculas = new ArrayList<>();
    }

    public Pelicula crearPelicula() {

        Pelicula pelicula = new Pelicula();
        System.out.println("Ingrese el titulo :");
        pelicula.setTitulo(input.next());
        System.out.println("Ingrese el director :");
        pelicula.setDirector(input.next());
        System.out.println("Ingrese la cantidad de horas de la pelicula :");
        pelicula.setHoras(input.nextInt());

        listaPeliculas.add(pelicula);

        return pelicula;

    }

    public void mostrarLista() {
        for (Pelicula var : listaPeliculas) {
            System.out.println(var);
        }
    }

    public void listaMayorhora() {
        for (Pelicula var : listaPeliculas) {
            if (var.getHoras() > 1) {
                System.out.println(var);
            }
        }
    }
   public void mayortiempo(){
        Collections.sort(listaPeliculas, ordenDuracionDescen);
       for (Pelicula var : listaPeliculas ) {
            System.out.println(var);
        }
     
       
   }
   public void menorTiempo (){
       Collections.sort(listaPeliculas, ordenDuracionAsscen);
        for (Pelicula var : listaPeliculas ) {
            System.out.println(var);
        }
      
   }
   
   public void tituloAlfab (){
       Collections.sort(listaPeliculas, tituloAlfabetica);
       
        for (Pelicula nombre : listaPeliculas) {
            System.out.println(nombre);
        }
   }
   public void directorAlfab (){
       Collections.sort(listaPeliculas, directorAlfabetica);
       
        for (Pelicula nombre : listaPeliculas) {
            System.out.println(nombre);
        }
       
   }
}
