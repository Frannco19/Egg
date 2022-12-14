/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Random;

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
       
        int matriz [] [] = new int [4][4];
        //Numeros Random
       for (int x=0; x < 4; x++) {
          for (int y=0; y < 4; y++) {
              
             matriz[x][y] = (int) (Math.random()*4+1);
             
  }
           
}
           //Mostrar matriz
             for (int x=0; x < 4; x++) {
          for (int y=0; y < 4; y++) {
              System.out.print("[" +matriz[x][y]+ "]");
  }
                 System.out.println("");
             
                 
}
             System.out.println("------------------------------");
        
             //Matriz traspuesta
             for (int x=0; x < 4; x++) {
               for (int y=0; y < 4; y++) {
                matriz[x][y] = matriz[y][x];
                   System.out.print("["+matriz[y][x]+ "]");
  }
                 System.out.println("");
}
         
    }
    
}
