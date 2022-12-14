
package Entidad;

import java.util.HashSet;


public class Pais {
    
    private String Pais;

    public Pais() {
    }

    public Pais(String Pais) {
        this.Pais = Pais;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    @Override
    public String toString() {
        return "Pais{" + "Pais=" + Pais + '}';
    }

    
}
