package Service;

import Entidad.Matematica;

public class Servicio {
    
    public double devolverMayor (Matematica mate){
        double mayor;
        if (mate.getNum1()>mate.getNum2()){
            mayor = mate.getNum1();
        }else{
            mayor = mate.getNum2();
        }
        return mayor;
    }
    public void CalcularPotencia(Matematica mate){
        int mayor = (int) Math.round(Math.max(mate.getNum1(), mate.getNum2()));
        int menor = (int) Math.round(Math.min(mate.getNum1(), mate.getNum2()));
        int potencia = (int) Math.pow(mayor, menor);
        System.out.println("El numero mayor elevado al numero menor es :" + potencia);
}
    public void CalcularRaiz(Matematica mate){
         double menor = (double) Math.round(Math.min(mate.getNum1(), mate.getNum2()));
         double raiz = Math.sqrt(menor);
         System.out.println("La raiz cuadrada del menor valor es :" + raiz);
    }
    }
            

