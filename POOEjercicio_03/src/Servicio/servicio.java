
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;


public class servicio {

   
    public void Operacion(Operacion numero1, Operacion numero2){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero 1 :");
        numero1.setNumero1(input.nextInt());
        System.out.println("Ingrese el numero 2 :");
        numero2.setNumero2(input.nextInt());
    }
    public void Sumar(Operacion numero1, Operacion numero2){
        int suma;
        suma = numero1.getNumero1() + numero2.getNumero2();
        System.out.println("La suma de los numeros es :" + suma);
    }
    
    public void Restar(Operacion numero1, Operacion numero2){
        int resta;
        resta = numero1.getNumero1() - numero2.getNumero2();
        System.out.println("La esta de los numeros es :" + resta);
    }
    public void Multiplicar(Operacion numero1, Operacion numero2){
        if (numero1.getNumero1() ==0 ||  numero2.getNumero2()==0 ){
            System.out.println("Es un error ya que el resultado es cero");
        }else{
            int multiplicar;
            multiplicar = numero1.getNumero1() * numero2.getNumero2();
            System.out.println("La multiplicacion de los numeros es :" + multiplicar);
        }
    }
    public void Dividir(Operacion numero1, Operacion numero2){
        if (numero1.getNumero1() ==0 ||  numero2.getNumero2()==0){
             System.out.println("Es un error ya que el resultado es cero");
        }else{
            int dividir;
            dividir = numero1.getNumero1() / numero2.getNumero2();
            System.out.println("La division de los numeros es :" + dividir);
        }
    }

}
