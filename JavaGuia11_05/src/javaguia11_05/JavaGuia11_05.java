package javaguia11_05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaGuia11_05 {

    public static void main(String[] args) {


            Scanner input = new Scanner(System.in).useDelimiter("\n");
       int num = (int) (Math.random()*500+1);
       int contador = 0;
       int numIngresado = 0;
       boolean band = false;
        do{
            try{
               System.out.println("Adivine un numero del 1 al 500 :");
            numIngresado = input.nextInt();
            if(numIngresado!= num){
                contador++;
                
            }else{
                System.out.println("Numero Correcto!!");
                band = true;
            } 
            }catch(InputMismatchException e ){
                contador++;
                System.out.println(e.getMessage());
                input.next();
            }
        }while(!band);
        
        System.out.println("Las respuestas incorrectas son :" + contador);
        
    }
             
        }
    
