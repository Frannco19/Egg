package Entidad;

public class Raices {

    private int a;
    private int b;
    private int c;

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminante() {
        double discriminante;
        discriminante = (double) Math.pow(b, 2) - 4 * a * c;
        return discriminante;
    }

    public boolean tieneRaices() {
        boolean band = false;

        band = getDiscriminante() >= 0;
        return band;
    }

    public boolean tieneRaiz() {
        boolean band = false;

        band = getDiscriminante() == 0;
        return band;
    }

    private void obtenerRaices() {
        System.out.println("1er Raiz :" + this.resolverRaizPositiva());
        System.out.println("2da Raiz :" + this.resolverRaizNegativa());
    }
    
    private void obtenerRaiz(){
        System.out.println("Unica raiz :" + this.resolverRaizPositiva());
    }
   public void calcular(){
       if (this.tieneRaices()){
           this.obtenerRaices();
       }else {
          if (this.tieneRaiz()){
              this.obtenerRaiz();
          } else{
              System.out.println("La ecuacion de 2do grado no tiene solucion ");
          }
         
      
       }
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private double resolverRaizPositiva(){
        return (-b+Math.sqrt(Math.pow(this.getB(),2)-(4*a*c)))/(2*a);
    }
    private double resolverRaizNegativa(){
        return (-b-Math.sqrt(Math.pow(this.getB(),2)-(4*a*c)))/(2*a);
    }
}
