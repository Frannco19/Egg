package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;


public class Service {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public void llenarCafetera(Cafetera cafe){
      cafe.setCapacidadActual(cafe.getCapacidadMaxima());
    } 
    public void servirTaza(Cafetera cafe){
        System.out.println("Ingrese el tamaño de la tasa : 1) Grande 2) Mediano 3) Chico");
        String tamaño = input.next();
       if (null == tamaño){
           System.out.println("Eleccion erronea");
       }else switch (tamaño) {
            case "Grande":
                cafe.setCapacidadActual(cafe.getCapacidadActual()- 200);
                break;
            case "Mediano":
                cafe.setCapacidadActual(cafe.getCapacidadActual()- 100);
                break;
            case "Chico":
                cafe.setCapacidadActual(cafe.getCapacidadActual()- 50);
                break;
            default:
                System.out.println("No hay cafe disponible");
                break;
        }
    }
    /*
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
    */
    public void vaciarCafetera(Cafetera cafe){
       cafe.setCapacidadActual(0);
        System.out.println("Cafetera vacia");
    }
  
    public void agregarCafe(Cafetera cafe){
        int cafeg;
        System.out.println("Ingrese una cantidad de cafe :");
        cafeg = input.nextInt();
        cafe.setCapacidadActual(cafe.getCapacidadActual() + cafeg);
    }
    public void Menu (Cafetera cafe){
        String aux = " ";
        do {
        System.out.println("Ingrese una opcion :");
        System.out.println("1- LLENAR CAFE");
        System.out.println("2- SERVIR TAZA");
        System.out.println("3- VACIAR CAFETERA");
        System.out.println("4- AGREGAR CAFE");
        System.out.println("5- SALIR");
        int opcion = input.nextInt();
        switch (opcion){
            case 1:
                llenarCafetera(cafe);
                break;
            case 2:
                servirTaza(cafe);
                break;
            case 3:
                vaciarCafetera(cafe);
                break;
            case 4:
                agregarCafe(cafe);
                break;
            default:
                System.out.println("Desea Salir? s/n");
                aux = input.next();
        }
        } while (! "s".equalsIgnoreCase(aux));
       
    }
}
