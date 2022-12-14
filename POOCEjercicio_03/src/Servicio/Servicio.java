
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Servicio {
         List<Alumno> Alumnos = new ArrayList();
         Scanner input = new Scanner(System.in).useDelimiter("\n");
    
         
    public Alumno crearAlumno(){   
        
        Alumno alumno = new Alumno();
        ArrayList<Integer> notasAlumnos = new ArrayList();
        System.out.println("Ingrese el nombre del alumno :");
        alumno.setNombre(input.next());
        for (int i = 0; i < 3; i++) {
           System.out.println("INGRESE LAS 3 NOTAS :");
           notasAlumnos.add(input.nextInt());
           alumno.setNotasAlumnos(notasAlumnos);
        }
        Alumnos.add(alumno);
        
        return alumno;
    }

    public void mostrarLista(){
      
        for ( Alumno var : Alumnos) {
            System.out.println(var);
        }
  }
    
    public void Nota(){
        System.out.println("Ingrese el Alumn que desee calcular :");
        String var1 = input.next();
        
        for (Alumno var : Alumnos) {
            if (var1.equals(var.getNombre())){
                calcularNota((ArrayList<Integer>) var.getNotasAlumnos());
                
            }
        }
        System.out.println("Desea Calcular otra nota :");
        String var2 = input.next();
        if(var2.equals("si")){
            Nota();
        }
    } 
    
    public void calcularNota(ArrayList<Integer> notasAlumnos){
        
        int num = 0;
        
        for (Integer num2 : notasAlumnos) {
            
            num = num + num2;
        }
         System.out.println("El promedio de Notas calculado es :" + num/3); 
    } 
    
    
    
    }
    

