
package Entidad;


public class Velero extends Barco{
    
    private int numeroMastiles;

    public Velero() {
    }

 
    public Velero(int numeroMastiles, String matricula, int esloraMetros, int anioFabricado) {
        super(matricula, esloraMetros, anioFabricado);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

  
    
    
    
}
