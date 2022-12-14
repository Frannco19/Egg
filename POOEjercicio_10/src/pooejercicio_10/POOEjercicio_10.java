package pooejercicio_10;

import java.util.Arrays;


public class POOEjercicio_10 {

  
    public static void main(String[] args) {
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];
        for (int i = 0; i < 50; i++) {
            vectorA[i] = Math.random();
        }
        System.out.println("El vector 1 es :" + Arrays.toString(vectorA));
        
        Arrays.sort(vectorA);
        System.out.println("El vector ordenado es :" + Arrays.toString(vectorA));
        System.arraycopy(vectorA, 0, vectorB, 0, 10);
        /*
         System.arraycopy( Desde la posicion 1 (0) del vectorA A;
        */
        double var1 = 0.5;
        System.out.println("----------------------------------------");
        Arrays.fill(vectorB, 10, 20, var1);
        System.out.println(Arrays.toString(vectorB));
        
    }
    
}
