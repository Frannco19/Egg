
package javaguia10_04;

import Entidad.Circulo;
import Entidad.Rectangulo;


public class JavaGuia10_04 {

   
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo(2,4);
       
        Rectangulo r1 = new Rectangulo(2,4);
        
        System.out.println(c1.area() + " " +  c1.perimetro());
        System.out.println(r1.area() + " " + r1.perimetro());
    }
    
}
