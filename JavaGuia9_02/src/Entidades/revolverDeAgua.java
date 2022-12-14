
package Entidades;


public class revolverDeAgua {
    
    private int posActual; //= (int) (Math.random() * 6 + 1);
    private int posAgua; // = (int) (Math.random() * 6 + 1);

    public revolverDeAgua() {
        posActual = 0;
        posAgua = 0;
    }

    public revolverDeAgua(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }
    
    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }
    
    public void llenarRevolver(){
       this.posActual =  (int) (Math.random() * 6 + 1);
       this.posAgua = (int) (Math.random() * 6 + 1);
    
    }

    public boolean mojar(){
        boolean mojar = false;
        if(posActual == posAgua){
            mojar = true;
        }
        return mojar;
    }
    
  public void siguienteChorro(){
        if (posActual == 6 && posAgua != 6) {
            setPosActual(1);
        }else{
            setPosActual(posActual+=1);
        }
    }

    
    @Override
    public String toString() {
        return "revolverDeAgua{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }
    
    
}
