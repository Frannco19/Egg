
package Entidad;

import java.util.Scanner;


public class Lavadora extends Electrodomestico{
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga ,double precio, int peso, String color, char consEn) {
        super(precio, peso, color, consEn);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public Lavadora crearLavadora (){
        Scanner input = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga de lavadora :");
        setCarga(input.nextInt());
        Lavadora lav = new Lavadora(carga,precio, peso, color, consEn);
        return lav;
    }
    @Override
    public double precioFinal(){
        if(getCarga()>30){
            this.precio = super.precioFinal()+500;
        }else{
            this.precio = super.precioFinal();
        }
        return 0;
    }
    
      @Override
    public String toString() {
        return "Lavadora {" + "carga= " + carga +  "precio= " + precio + ", peso= " + peso + ", color= " + color + ", consEn= " + consEn + '}';
    }
}
