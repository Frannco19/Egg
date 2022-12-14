
package Entidad;

import java.util.ArrayList;
import java.util.List;


public class Alumno {
    
    private String nombre;
    
    private List<Integer> notasAlumnos;

    public Alumno() {
    }

    public Alumno(String nombre, List<Integer> notasAlumnos) {
        this.nombre = nombre;
        this.notasAlumnos = new ArrayList();
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotasAlumnos() {
        return notasAlumnos;
    }

    public void setNotasAlumnos(List<Integer> notasAlumnos) {
        this.notasAlumnos = notasAlumnos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notasAlumnos=" + notasAlumnos + '}';
    }

   
    
    
    
}
