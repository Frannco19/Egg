package pooejercicio_07;

import Entidad.Persona;
import Servicio.Service;

public class POOEjercicio_07 {

    public static void main(String[] args) {
        

        Service serv = new Service();
         
        try {
         Persona pers1 = null;
         serv.esMayorDeEdad(pers1);  
         System.out.println(pers1);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        
       
        /*
        Persona pers2 = new Persona();
        Persona pers3 = new Persona();
        Persona pers4 = new Persona();
        Service servicio = new Service();
        int bajoPeso =0;
        int pesoIdeal= 0;
        int sobrePeso = 0;
        int esMayorDeEdad = 0;
        
        servicio.creaPersona(pers1);
        servicio.calcularIMC(pers1);
        
  
        if (servicio.calcularIMC(pers1)==-1){
            bajoPeso++;
        }else if (servicio.calcularIMC(pers1)==0){
            pesoIdeal++;
        }else{
            sobrePeso++;
        }
        if (servicio.esMayorDeEdad(pers1)== true){
            esMayorDeEdad++;
        }
        System.out.println("-------------------------");
        
        servicio.creaPersona(pers2);
        servicio.calcularIMC(pers2);
      
        if (servicio.calcularIMC(pers2)==-1){
            bajoPeso++;
        }else if (servicio.calcularIMC(pers2)==0){
            pesoIdeal++;
        }else{
            sobrePeso++;
        }
        if (true == servicio.esMayorDeEdad(pers2)){
            esMayorDeEdad++;
        }
        System.out.println("-------------------------");
        
        servicio.creaPersona(pers3);
        servicio.calcularIMC(pers3);

        if (servicio.calcularIMC(pers3)==-1){
            bajoPeso++;
        }else if (servicio.calcularIMC(pers3)==0){
            pesoIdeal++;
        }else{
            sobrePeso++;
        }
        if (true == servicio.esMayorDeEdad(pers3)){
            esMayorDeEdad++;
        }
         System.out.println("-------------------------");
         
         servicio.creaPersona(pers4);
         servicio.calcularIMC(pers4);
          if (servicio.calcularIMC(pers4)==-1){
            bajoPeso++;
        }else if (servicio.calcularIMC(pers4)==0){
            pesoIdeal++;
        }else{
            sobrePeso++;
        }
        if (true == servicio.esMayorDeEdad(pers4)){
            esMayorDeEdad++;
        }
        System.out.println("el promedio de las bajo peso es "+ (bajoPeso*100)/4);
        System.out.println("El promedio de las personas comn peso normal es :" + ((pesoIdeal*100)/4)+ "%");
        System.out.println("El prmedio de la gentre que tiene sobrepeso :" + ((pesoIdeal*100)/4)+ "%");
        System.out.println("El promedio de los mayor de edad son :" + ((esMayorDeEdad*100)/4) +"%");
    }
         */
    }
}
