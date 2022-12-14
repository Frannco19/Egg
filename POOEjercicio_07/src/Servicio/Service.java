package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class Service {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    public void creaPersona(Persona persona){
       
         System.out.println("Ingrese su nombre: ");
         persona.setNombre(input.next());
         System.out.println("Ingrese su edad: ");
         persona.setEdad(input.nextInt());
         do{
         System.out.println("Ingrese su sexo: H)Hombre M)Mujer O)Otro");
         persona.setSexo(input.next());
         }while (!"H".equalsIgnoreCase(persona.getSexo()) && !"M".equalsIgnoreCase(persona.getSexo()) && !"O".equalsIgnoreCase(persona.getSexo()));
         System.out.println("Ingrese su peso :");
         persona.setPeso(input.nextDouble());
         System.out.println("Ingrese su altura :");
         persona.setAltura(input.nextDouble());
        
    }
    public int calcularIMC(Persona persona){
        double IMC;
        IMC = persona.getPeso()/(Math.pow(persona.getAltura(), 2));
        int indice;
        if (IMC<20){
            return -1;
        }else if(IMC>=20 && IMC<=25){
            return 0;
        }else{
            return 1;  
        }
        
    }
    public boolean esMayorDeEdad(Persona persona){  
        return persona.getEdad()>=18;   
    }
    }


