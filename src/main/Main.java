
package main;

import entidades.Artista;
import entidades.Cancion;
import tendenciasMusicales.Normal;
import vistas.YouTubeMusic;


public class Main {

 
    public static void main(String[] args) {
//        Artista artista = new Artista("ColdPlay", "");
//        Cancion cancion = new Cancion("The Scientist", "Balada romántica - British Pop", artista, "5:09");
        
        new YouTubeMusic().setVisible(true);
    }

}
