
package Entidad;

import java.util.Date;


public class Persona {
    private String nommbre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nommbre, Date fechaNacimiento) {
        this.nommbre = nommbre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public boolean menorQue(int Edad){
        Date fechaActual = new Date();
        boolean esMenor=true;
        if (Edad >=(fechaActual.getYear()- this.fechaNacimiento.getYear())){
        esMenor = false;
        }
        return esMenor;
    }
       
    

    @Override
    public String toString() {
        return "Persona{" + "nommbre=" + nommbre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    
}
