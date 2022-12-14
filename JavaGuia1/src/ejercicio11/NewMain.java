/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;


import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros :");
        int num1 = input.nextInt();
        System.out.println("Ingrese el otro numero :");
        int num2 = input.nextInt();
        menuOpciones(num1,num2);
             }

     public static void menuOpciones (int num1,int num2){
         String opt;
         int opcion;
         boolean exit = false;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("=====================");
        System.out.println("MENU");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        do{
        System.out.println("Elija opcion");
        opcion = input.nextInt();
        if ( opcion == 5){
            System.out.println("¿Deseas salir del programa? S/N");
            opt = input.next();
            if (opt.equals("S") || opt.equals("s")){
                exit = true;
            } else {
                System.out.println("Sigue en el programa");
                System.out.println("--------------------");
            } 
           }else {
                   opcionesMenu(num1, num2, opcion); 
             }
            
        

        
        }while (!exit);
     }
     
      public static void opcionesMenu (int num1, int num2, int opcion){
            
          switch(opcion){
              case 1:
                  System.out.println("La suma es :" + (num1+num2));
                  break;
              case 2:
                  System.out.println("La resta es :" + (num1-num2));
                  break;
              case 3:
                  System.out.println("La multiplicacion es :" + (num1*num2));
                  break;
              case 4:
                  System.out.println("La division es :" + (num1/num2));
                  break;
          }     
}


}





































       /* int opcion=0;
        String opcion2;
        menu0(opcion);
        menu(opcion);
        if (opcion!=5){
            menu0(opcion);
        }else if (opcion==5){
            System.out.println("¿Realmente queres salir? S/N");
            opcion2 = input.next();
            if ("S".equals(opcion2)){
                
            }else{
                menu0(opcion);
            }
        }else{ 
            {
                System.out.println("Numero no valido"); 
            }                                   
        }
    }
        public static void menu0 (int opcion) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("=====================");
        System.out.println("MENU");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        System.out.println("Elija opcion");
        opcion = input.nextInt();

        }
       public static int menu( int num1, int num2) {
           int opcion=0;
        switch (opcion){
            case 1:{
                int suma = num1 + num2;
                System.out.println("La suma de los numeros es " + suma);
            }
                
                break;
            case 2:{
                int resta = num1 - num2;
                System.out.println("La resta de los numeros es " + resta);
            }
                 break;
            case 3:{
                int multiplicar = num1 * num2;
                System.out.println("La multiplicacion de los numeros es :" + multiplicar);
            }
                 break;
            case 4:{
                int dividir = num1 / num2;
                System.out.println("La division de los numeros es :" + dividir);
            }
            break;
              */



    
    







