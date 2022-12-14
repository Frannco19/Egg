
package Entidad;


public class BarcoaMotor extends Barco{
    
    private int potencia;

    public BarcoaMotor() {
        
    }
    
    public BarcoaMotor(int potencia, String matricula, int esloraMetros, int anioFabricado) {
        super(matricula, esloraMetros, anioFabricado);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }


}
