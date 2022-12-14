package pooejercicio_09;

import Entidad.Matematica;
import Service.Servicio;


public class POOEjercicio_09 {

    
    public static void main(String[] args) {
       Matematica num = new Matematica();
       Servicio service = new Servicio();
       num.setNum1(Math.random()*10+1);
       num.setNum2(Math.random()*10+1);
       System.out.println("El numero 1 es :" + num.getNum1());
       System.out.println("El numero 2 es :"+ num.getNum2());
       System.out.println("El valor mayor es :" + service.devolverMayor(num));
       service.CalcularPotencia(num);
       service.CalcularRaiz(num);
    }
    

}