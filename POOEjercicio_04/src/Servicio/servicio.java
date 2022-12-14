package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class servicio {
    
    public void crearRectangulo(Rectangulo base, Rectangulo altura){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la base del rectangulo :");
        base.setBase(input.nextDouble());
        System.out.println("Ingrese la altura del rectangulo :");
        altura.setAltura(input.nextDouble());
        
    }
    public void Superficie (Rectangulo base, Rectangulo altura){
        double superficie;
        superficie = base.getBase() * altura.getAltura();
        System.out.println("La superficie del rectangulo es :" + superficie);
        
        
    }
    public void Perimetro (Rectangulo base, Rectangulo altura){
        double perimetro;
        perimetro = (base.getBase() + altura.getAltura()) * 2;
        System.out.println("El perimetro del rectangulo :" + perimetro);
    }
    public void DibujarRectangulo (Rectangulo base, Rectangulo altura){
        for(int i=0; i < altura.getAltura(); i++){
            for (int j=0; j < base.getBase(); j++){
                if (i==0 || i ==(altura.getAltura()-1) || j==0 || j == (base.getBase()-1)){
                    System.out.print(" * ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
/*
public void dibujarRectangulo(Rectangulo base, Rectangulo altura){
         
         for (int i = 0; i < altura.getAltura(); i++) {
             for (int j = 0; j < base.getBase(); j++) {
               
                 if(i==0 || i== (altura.getAltura()-1) ||  j==0 || j==(base.getBase()-1)){
                     System.out.print(" * ");
                 }else{
                     System.out.println(" ");
                 }
                 
              }
             System.out.println(" "
*/