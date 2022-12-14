
package Entidad;

import java.util.ArrayList;


public class Perro {
    
    private String apodo;
    private Integer peso;

   //Relaciones 
    private ArrayList<Pulga> pulgaList;
    
    public Perro(){
        
    }

    public Perro(String apodo, Integer peso, ArrayList<Pulga> pulgaList) {
        this.apodo = apodo;
        this.peso = peso;
        this.pulgaList = pulgaList;
    }

    public ArrayList<Pulga> getPulgaList() {
        return pulgaList;
    }

    public void setPulgaList(ArrayList<Pulga> pulgaList) {
        this.pulgaList = pulgaList;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    
    
}
