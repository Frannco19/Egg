
package Entidad;


public class YatesDeLujo extends BarcoaMotor{
    
    private int numeroDeCamarotes;

    public YatesDeLujo() {
    }

   
    public YatesDeLujo(int numeroDeCamarotes, int potencia, String matricula, int esloraMetros, int anioFabricado) {
        super(potencia, matricula, esloraMetros, anioFabricado);
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    public int getNumeroDeCamarotes() {
        return numeroDeCamarotes;
    }

    public void setNumeroDeCamarotes(int numeroDeCamarotes) {
        this.numeroDeCamarotes = numeroDeCamarotes;
    }


 

  


    
    
    
    
}
