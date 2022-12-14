
package eggpoo;

public class Perro {
    private String apodo;
    private Integer peso;
    private boolean cola;
    private String raza;
    
    public boolean IsCola(){
        return cola;
    }

    public Perro() {
    }

    public Perro(String apodo, Integer peso, boolean cola, String raza) {
        this.apodo = apodo;
        this.peso = peso;
        this.cola = cola;
        this.raza = raza;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }
    

  
    @Override
   public String toString(){
       return "Datos : " + " Apodo =" + apodo + ", peso = " + peso + ", cola = " + cola + ", raza = " + raza;
   }


}