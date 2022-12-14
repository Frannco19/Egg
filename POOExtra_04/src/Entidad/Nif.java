package Entidad;


public class Nif {
    private long Dni;
    private char letra;

    public Nif() {
    }

    public Nif(long Dni, char letra) {
        this.Dni = Dni;
        this.letra = letra;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

   
    
}
