
package Entidades;

import java.util.HashSet;


public class Juego {
    
   private HashSet <Jugador> listaDeJugadores; 
   private revolverDeAgua revolver;

    public Juego() {
    }

    public Juego(HashSet<Jugador> listaDeJugadores, revolverDeAgua revolver) {
        this.listaDeJugadores = listaDeJugadores;
        this.revolver = revolver;
    }

    public HashSet<Jugador> getListaDeJugadores() {
        return listaDeJugadores;
    }

    public void setListaDeJugadores(HashSet<Jugador> listaDeJugadores) {
        this.listaDeJugadores = listaDeJugadores;
    }

    public revolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(revolverDeAgua revolver) {
        this.revolver = revolver;
    }
    
    public void llenarJuego(HashSet <Jugador> listaDeJugadores, revolverDeAgua rev){
        setListaDeJugadores(listaDeJugadores);
        setRevolver(revolver);
    }
    
    public void ronda(){
        boolean ronda = true;
        while(ronda){
            for (Jugador listaDeJugador : listaDeJugadores) {
                if(listaDeJugador.disparo(revolver)){
                    ronda = false;
                    System.out.println(listaDeJugador.toString());
                    break;
                }
                System.out.println(listaDeJugador.toString());
            }
        }
        
        
    }

    @Override
    public String toString() {
        return "Juego{" + "listaDeJugadores=" + listaDeJugadores + ", revolver=" + revolver + '}';
    }
   
   
}
