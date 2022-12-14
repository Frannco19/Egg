
package javaguia9_02;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.revolverDeAgua;
import java.util.HashSet;


public class JavaGuia9_02 {

    
    public static void main(String[] args) {
        
        revolverDeAgua rev = new revolverDeAgua();
        HashSet <Jugador> lista = new HashSet();
        Juego juego = new Juego();
        
        for (int i = 1; i <= 6; i++) {
            Jugador jugador = new Jugador();
            jugador.setId(i);
            jugador.setNombre("jugador" + i);
            lista.add(jugador);
        }
       juego.llenarJuego(lista, rev);
       juego.ronda();
       
    }
    
}
