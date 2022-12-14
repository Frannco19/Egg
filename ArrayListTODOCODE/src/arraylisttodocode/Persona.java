
package arraylisttodocode;


public class Persona {
    private int num;
    private String mombre;
    private int edad;

    public Persona() {
    }

    public Persona(int num, String mombre, int edad) {
        this.num = num;
        this.mombre = mombre;
        this.edad = edad;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMombre() {
        return mombre;
    }

    public void setMombre(String mombre) {
        this.mombre = mombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
