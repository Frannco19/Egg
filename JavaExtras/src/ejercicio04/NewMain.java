/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

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
        Scanner input=new Scanner(System.in);
        int n; //pongamos que n vale 3950
        System.out.print("Introduce el numero que te lo voy a comvertir a romano : ");
        n = input.nextInt();
        int miles, centenas, decenas, unidades;
        int resto = n; // resto vale 3950
        String resultado = "";

        miles = resto / 1000; //3950/1000=3
        resto = resto % 1000;  //950

        centenas = resto / 100; //9
        resto = resto % 100; // 50

        decenas = resto / 10; //5
        resto = resto % 10; // 0

        unidades = resto;

        for (int i = 1; i <= miles; i++) {
            resultado += "M";
        }
        switch (centenas) {
            case 1:
                resultado += "C";
                break;
            case 2:
                resultado += "CC";
                break;
            case 3:
                resultado += "CCC";
                break;
            case 4:
                resultado += "CD";
                break;
            case 5:
                resultado += "D";
                break;
            case 6:
                resultado += "DC";
                break;
            case 7:
                resultado += "DCC";
                break;
            case 8:
                resultado += "DCCC";
                break;
            case 9:
                resultado += "CM";
                break;
        }
        switch (decenas) {
            case 1:
                resultado += "X";
                break;
            case 2:
                resultado += "XX";
                break;
            case 3:
                resultado += "XXX";
                break;
            case 4:
                resultado += "XL";
                break;
            case 5:
                resultado += "L";
                break;
            case 6:
                resultado += "LX";
                break;
            case 7:
                resultado += "LXX";
                break;
            case 8:
                resultado += "LXXX";
                break;
            case 9:
                resultado += "XC";
                break;
        }
        switch (unidades) {
            case 1:
                resultado += "I";
                break;
            case 2:
                resultado += "II";
                break;
            case 3:
                resultado += "III";
                break;
            case 4:
                resultado += "IV";
                break;
            case 5:
                resultado += "V";
                break;
            case 6:
                resultado += "VI";
                break;
            case 7:
                resultado += "VII";
                break;
            case 8:
                resultado += "VIII";
                break;
            case 9:
                resultado += "IX";
                break;
        }
        System.out.println("El número " + n + " en números romanos es: " + resultado);
    }
}
    
    

