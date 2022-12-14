
package Service;

import Entidad.Cuenta;
import java.util.Scanner;




public class Servicio {
     Scanner input = new Scanner(System.in).useDelimiter("\n");
    public void crearCuenta(Cuenta cuenta){
       
        System.out.println("Ingrese el numero de cuenta :");
        cuenta.setNumeroCuenta(input.nextInt());
        System.out.println("Ingrese el  DNI del cliente :");
        cuenta.setDniCliente(input.nextLong());
        System.out.println("Ingrese el saldo actual :");
        cuenta.setSaldoActual(input.nextInt());
        
    }
    public int ingresarSaldo (Cuenta cuenta){
        int ingreso;
        System.out.println("Ingrese saldo a depositar ");
        ingreso = input.nextInt();
        int suma = ingreso + cuenta.getSaldoActual();
        cuenta.setSaldoActual(suma);
        return suma;
    }
    public void retirarSaldo (Cuenta cuenta){
        int extraccion;
        System.out.println("Ingrese la cantidad de saldo a retirar :");
        extraccion = input.nextInt();
        if (cuenta.getSaldoActual()< extraccion){
            cuenta.setSaldoActual(0);
        }else{
        int resta = cuenta.getSaldoActual() - extraccion;
        cuenta.setSaldoActual(resta);
            System.out.println("El Saldo Actual es :" + cuenta.getSaldoActual());
        }
    }
    public void extraccionRapida(Cuenta cuenta){
        int extraccionR;
        System.out.println("Ingrese la cantidad de saldo a retirar al instante :");
        extraccionR = input.nextInt();
        if (extraccionR <= cuenta.getSaldoActual()*0.20){
           cuenta.setSaldoActual(cuenta.getSaldoActual() - extraccionR);
        }else{
            System.out.println("Lo que quiere sacar es mas del 20%");
        }
        
    }
    public void consultarSaldo(Cuenta cuenta){
        System.out.println("El saldo disponible es :" + cuenta.getSaldoActual());
    }
    public void consultarDatos(Cuenta cuenta){
        System.out.println("El numero de cuenta es :" + cuenta.getNumeroCuenta());
        System.out.println("El DNI del clientes es :" + cuenta.getDniCliente());
        System.out.println("El saldo actual es : " + cuenta.getSaldoActual());
        
    }
    public void Menu(Cuenta cuenta){
        String aux = " ";
        do {
            System.out.println("Ingrese una opcion :");
            System.out.println("1- INGRESAR SALDO");
            System.out.println("2- RETIRAR SALDO");
            System.out.println("3- EXTRAER RAPIDO SALDO");
            System.out.println("4- CONSULTAR SALDO");
            System.out.println("5- CONSULTAR DATOS");
            System.out.println("6- SALIR");
            int opcion = input.nextInt();
            switch (opcion){
                case 1:
                    ingresarSaldo(cuenta);
                    break;
                case 2:
                    retirarSaldo(cuenta);
                    break;
                case 3:
                    extraccionRapida(cuenta);
                    break;
                case 4:
                    consultarSaldo(cuenta);
                    break;
                case 5:
                    consultarDatos(cuenta);
                default:
                    System.out.println("Desea Salir? S/N");
                    aux = input.next();
            }
        }while (! "s".equalsIgnoreCase(aux));
    }
}
