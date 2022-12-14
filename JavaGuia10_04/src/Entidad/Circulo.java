
package Entidad;

import Interfaces.CalculoForma;
import static java.lang.Math.PI;


public class Circulo implements CalculoForma {

    private int radio;
    private int diametro;

    public Circulo() {
    }

    public Circulo(int radio, int diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    
    /*
    Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
    */
    @Override
    public int area() {
        return (int) (PI * Math.pow(radio, 2));
    }

    @Override
    public int perimetro() {
        return (int) (PI * diametro);
    }
    

    
    
}
