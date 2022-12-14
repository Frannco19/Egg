
package ejerciciovideojuego;

import ejerciciovideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;


public class EjercicioVideoJuego {

 
    public static void main(String[] args) {
        
        List<VideoJuego> listaVideoJuegos = new ArrayList <VideoJuego>();
        
        VideoJuego video1 = new VideoJuego (123, "futbol", "PC", 2, "plataforma");
        
        VideoJuego video2 = new VideoJuego (124, "Tenis", "PC",2, "Estrategia");
        
        VideoJuego video3 = new VideoJuego (125, "Counter Strike", "PC",1, "Estrategia");
        
        VideoJuego video4 = new VideoJuego (126, "Mario Kart", "Nintendo 64",2, "plataforma");
        
        VideoJuego video5 = new VideoJuego (127, "Age of empire II", "Nintendo 64",1, "plataforma");
        
       listaVideoJuegos.add(video1);
       
    }
    
}
