/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class POOEjercicio01 {

    public static void main(String[] args) {
        Alumno alu1 = new Alumno(1,"Franco","Aranibar");
        Alumno alu2 = new Alumno();
        
        System.out.println("La id del alumno 1 es :" + alu1.getId());
        System.out.println("El nombre del alumno 1 es :"+ alu1.getNombre());
        System.out.println("El Apellido del alumno 1 es :"+ alu1.getapellido());
        
        alu2.setId(2);
        alu2.setNombre("Luis");
        alu2.setapellido("Espert");
        
        System.out.println("-------------------");
        System.out.println("La id del alumno 2 es :" + alu2.getId());
        System.out.println("El nombre del alumno 2 es :"+ alu2.getNombre());
        System.out.println("El Apellido del alumno 2 es :"+ alu2.getapellido());
        
    }
    
}
