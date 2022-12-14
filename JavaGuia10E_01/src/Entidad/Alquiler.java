
package Entidad;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;


public class Alquiler {
    
    /*
    el nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
    */
    private String nombre;
    private int numeroDni;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDeDevolucion;
    private int posicionAmarre;
    private Barco barco;
    
    
    public Alquiler() {
    }

    public Alquiler(String nombre, int numeroDni, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.numeroDni = numeroDni;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDni() {
        return numeroDni;
    }

    public void setNumeroDni(int numeroDni) {
        this.numeroDni = numeroDni;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    
    
}
