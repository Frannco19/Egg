package Entidad;

import java.util.Scanner;

public class Electrodomestico {

    /*
    atributos: precio, color,
consumo energético (letras entre A y F) y peso.
     */
    protected double precio;
    protected int peso;
    protected String color;
    protected char consEn;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, int peso, String color, char consEn) {
        this.precio = 1000;
        this.peso = peso;
        this.color = color;
        this.consEn = consEn;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsEn() {
        return consEn;
    }

    public void setConsEn(char consEn) {
        this.consEn = consEn;
    }

    public char comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' || letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
    }

    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return color;
        } else {
            return "Blanco";
        }

    }
    public void crearElectrodomestico(){
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un color :");
        String colorE = input.next();
        setColor(comprobarColor(colorE));
        System.out.println("Ingrese el peso :");
        setPeso(input.nextInt());
        System.out.println("Ingrese el consumo energetico :");
        char consumo = input.next().charAt(0);
        setConsEn(comprobarConsumoEnergetico(consumo));
    }
    
    public double precioFinal(){
        double precioT = 0;
        switch (getConsEn()) {
            case 'A':
                if(getPeso()>=1 && getPeso()<=19){
                    precioT= getPrecio()+1000 + 100;
                    setPrecio(precioT);
                    return precioT;
                }else if(getPeso()>=20 && getPeso()<=49){
                    precioT= getPrecio()+1000 + 500;
                    setPrecio(precioT);
                    return precioT;
                }else if(getPeso()>=50 && getPeso()<=79){
                    precioT= getPrecio()+1000 + 800;
                    setPrecio(precioT);
                    return precioT;
                }else if(getPeso()>=80){
                    precioT= getPrecio()+1000 + 1000;
                    setPrecio(precioT);
                    return precioT;
                }
             case 'B' : {
                if (getPeso() >= 1 && getPeso() <= 19) {
                    precioT= getPrecio() + 800 + 100;
                    setPrecio(precioT);
                    return precioT;
                }else if(getPeso() >= 20 && getPeso() <= 49){
                    precioT = getPrecio() + 800 + 500;
                    setPrecio(precioT);
                    return precioT;
                }else if(getPeso() >= 50 && getPeso() <= 79){
                    precioT = getPrecio() + 800 + 800;
                    setPrecio(precioT);
                    return precioT;
                }else{
                    precioT = getPrecio() + 800 + 1000;
                    setPrecio(precioT);
                    return precioT;
                }
            }   
           case 'C' : {
                if (getPeso() >= 1 && getPeso() <= 19) {
                    precioT = getPrecio() + 600 + 100;
                    setPrecio(precioT);
                    return precioT;
                }else if(getPeso() >= 20 && getPeso() <= 49){
                    precioT = getPrecio() + 600 + 500;
                    setPrecio(precioT);
                    return precioT;
                }else if(getPeso() >= 50 && getPeso() <= 79){
                    precioT = getPrecio() + 600 + 800;
                    setPrecio(precioT);
                    return precioT;
                }else{
                    precioT = getPrecio() + 600 + 1000;
                    setPrecio(precioT);
                    return precioT;
                }
            }
           case 'D' : {
                if (getPeso() >= 1 && getPeso() <= 19) {
                    precioT = getPrecio() + 500 + 100;
                    setPrecio(precioT);
                    return precioT;
                }else if(getPeso() >= 20 && getPeso() <= 49){
                    precioT = getPrecio() + 500 + 500;
                    setPrecio(precioT);
                    return precioT;
                }else if(getPeso() >= 50 && getPeso() <= 79){
                    precioT = getPrecio() + 500 + 800;
                    setPrecio(precioT);
                    return precioT;
                }else{
                    precioT = getPrecio() + 500 + 1000;
                    setPrecio(precioT);
                    return precioT;
                }
            }
           case 'E' :{
                if (getPeso() >= 1 && getPeso() <= 19) {
                    precioT = getPrecio() + 300 + 100;
                    setPrecio(precioT);
                    return precioT;
                }else if(getPeso() >= 20 && getPeso() <= 49){
                    precioT = getPrecio() + 300 + 500;
                    setPrecio(precioT);
                    return precioT;
                }else if(getPeso() >= 50 && getPeso() <= 79){
                    precioT = getPrecio() + 300 + 800;
                    setPrecio(precioT);
                    return precioT;
                }else{
                    precioT = getPrecio() + 300 + 1000;
                    setPrecio(precioT);
                    return precioT;
                }
            }
           case 'F' : {
                if (getPeso() >= 1 && getPeso() <= 19) {
                    precioT = getPrecio() + 100 + 100;
                    setPrecio(precioT);
                    return precioT;
                }else if(getPeso() >= 20 && getPeso() <= 49){
                    precioT = getPrecio() + 100 + 500;
                    setPrecio(precioT);
                    return precioT;
                }else if(getPeso() >= 50 && getPeso() <= 79){
                    precioT = getPrecio() + 100 + 800;
                    setPrecio(precioT);
                    return precioT;
                }else{
                    precioT = getPrecio() + 100 + 1000;
                    setPrecio(precioT);
                    return precioT;
                }
            }
            default:
                System.out.println("Letra incorreccta");
        }
        return 0;
            
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consEn=" + consEn + '}';
    }
    
}
