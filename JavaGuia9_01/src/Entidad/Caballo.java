
package Entidad;

public class Caballo extends Animal{

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void alimentarse(){
        System.out.println("El caballo fue alimentado");
    }
    
    
    
}
