
package Entidad;

import java.util.Scanner;


public class Televisor extends Electrodomestico {
    
    private int resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean tdt, double precio, int peso, String color, char consEn) {
        super(precio, peso, color, consEn);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
    public Televisor crearTelevisor(){
        Scanner input = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor :");
        setResolucion(input.nextInt());
        System.out.println("Tiene TDT?");
        setTdt(input.nextBoolean());
        Televisor tele = new Televisor(resolucion, tdt ,precio, peso, color, consEn);
        return tele;
    }
    public double precioFinal(){
        if(getResolucion()>40 && tdt){
            this.precio = super.precioFinal() *0.30 + 500;
        }else if (tdt){
             this.precio = super.precioFinal() + 500;
        }else{
            this.precio = super.precioFinal();
        }
        return 0;
    }
    
      @Override
    public String toString() {
        return "Televisor{" + "Pulgadas= "  + resolucion + " tdt= " +  tdt + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consEn=" + consEn + '}';
    }
}
