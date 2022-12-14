
package Entidad;

import Interfaces.CalculoForma;

public class Rectangulo implements CalculoForma {
    
    private int base;   
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    /*
    Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
    */
    
    
    @Override
    public int area() {
        return (int) base * altura; 
    }

    @Override
    public int perimetro() {
        return (int) (base + altura) * 2; 
    }
    
}
