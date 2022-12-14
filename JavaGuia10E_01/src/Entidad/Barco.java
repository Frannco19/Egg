
package Entidad;


public abstract class Barco {
    
    protected String matricula;
    protected int esloraMetros;
    protected int anioFabricado;

    public Barco() {
    }

    public Barco(String matricula, int esloraMetros, int anioFabricado) {
        this.matricula = matricula;
        this.esloraMetros = esloraMetros;
        this.anioFabricado = anioFabricado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEsloraMetros() {
        return esloraMetros;
    }

    public void setEsloraMetros(int esloraMetros) {
        this.esloraMetros = esloraMetros;
    }

    public int getAnioFabricado() {
        return anioFabricado;
    }

    public void setAnioFabricado(int anioFabricado) {
        this.anioFabricado = anioFabricado;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", esloraMetros=" + esloraMetros + ", anioFabricado=" + anioFabricado + '}';
    }
    
    
    
}
