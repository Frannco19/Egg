/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import java.util.Scanner;

/**
 5. Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 * @author Franco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in).useDelimiter("\n");
          String letra;
          double valor;
          boolean dato =true;
          System.out.println("VALOR A = >$1000 A $2000");
          System.out.println("VALOR B = >$500 A $ 900");
          System.out.println("VALOR C = >$250 A $400");
          System.out.println("Ingrese una letra :");
          letra = input.next();
         while (letra.equals("A") ||letra.equals("B") || letra.equals("C")){
              System.out.println("Ingrese un valor :");
              valor = input.nextInt();
              if (valor>=1000 && valor <=2000){
                  double pagoA = (double) (valor*0.50);
                  System.out.println("El valor total con descuento es :" + pagoA);
              }else if (valor>=500 && valor<=900){
                  double pagoB = (double) (valor*0.35);
                  System.out.println("El valor totasl con descuento es :" + pagoB);
              }else if (valor>=250 && valor<=400){
                  System.out.println("El valor total con descuento es :" + valor);
              }else{
              dato = false;
              System.out.println("CLase de socio no valido");
          }
    }
    
}
}
