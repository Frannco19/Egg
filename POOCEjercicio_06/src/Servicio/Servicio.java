
package Servicio;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Servicio {
    
     private final Scanner input;
     private final HashMap <String, Integer> llenarProductos;
     
     public Servicio(){
         this.input =new Scanner(System.in).useDelimiter("\n");
         this.llenarProductos = new HashMap<>();
        
     }
     
     public void agregarProducto(){
         String respuesta;
        do{
         Producto produc = new Producto();

         System.out.println("Ingrese el producto :");
         String producto1 = input.next();
         
         System.out.println("Ingrese el precio :");
         int precio1 = input.nextInt();
         
         produc.setProducto(producto1);
         produc.setPrecio(precio1);
         
         llenarProductos.put(producto1, precio1);
            System.out.println("Desea ingresar otro producto?");
            respuesta = input.next();
            if(respuesta.equals("No")){
                menu();
                break;
            }
         
        }while(true);  
     }
    
     public void modificarPrecio(){
         int nuevoP;
         System.out.println("Ingrese el producto que desee cambiar el precio :");
         String producto = input.next();
         
         if(llenarProductos.containsKey(producto)){
             System.out.println("Ingrese un nuevo precio :");
             nuevoP = input.nextInt();
             llenarProductos.replace(producto, nuevoP);
         }
            menu();
     }
     public void eliminarProducto(){
         System.out.println("Ingrese el nombre del producto que desa eliminar :");
         String producto = input.next();
         if(llenarProductos.containsKey(producto)){
             llenarProductos.remove(producto);
         }
         menu();
     }
    public void mostrarProductos(){
        System.out.println("Estos son los productos :");
        llenarProductos.entrySet().forEach((aux) -> {
            System.out.println(aux);
         });
        menu();
    }
    
    public void menu(){
        System.out.println("Menu de opciones :");
        System.out.println("1- AGREGAR PRODUCTO");
        System.out.println("2- MODIFICAR PRECIO");
        System.out.println("3- ELIMINAR PRODUCTO");
        System.out.println("4- MOSTRAR PRODUCTO");
        System.out.println("------------------------");
        System.out.println("Ingrese una opcion :");
        int var = input.nextInt();
        switch (var) {
            case 1:
                agregarProducto();
                break;
            case 2:
                modificarPrecio();
            case 3:
                eliminarProducto();
            case 4:
                mostrarProductos();
            default:
                System.out.println("Opcion incorrecta ");
        }
    }
}
