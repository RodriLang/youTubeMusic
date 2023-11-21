package tendenciasMusicales;

import entidades.Cancion;
import javax.swing.ImageIcon;

public class EnAuge extends TendenciaMusical {

    private int reproduccionesControl;
    private int likesControl;
    private int dislikesControl;

    public EnAuge(Cancion cancion) {
        super(cancion);
        icono = icono = new ImageIcon(getClass().getResource("/imagenes/cohete.png"));
        reproduccionesControl = reproducciones;
        likesControl = likes;
        dislikesControl = dislikes;
        horasSinReproduccion = 0;
    }
    public EnAuge(Cancion cancion, int reproducciones, int likes, int dislikes, int horasSinReproduccion) {
        super(cancion, reproducciones, likes, dislikes, horasSinReproduccion);
        icono = icono = new ImageIcon(getClass().getResource("/imagenes/cohete.png"));
        reproduccionesControl = reproducciones;
        likesControl = likes;
        dislikesControl = dislikes;
    }

    @Override
    public void medirPopularidad() {
        
            System.out.println(cancion.getEstado().getDislikes());
            System.out.println(dislikesControl);
        if (cancion.getEstado().getReproducciones()-reproduccionesControl > 50000 && cancion.getEstado().getLikes()-likesControl > 20000) {
            cancion.cambiarEstado(new EnTendencia(cancion, reproducciones, likes, dislikes, horasSinReproduccion));
        }
        if (cancion.getEstado().getDislikes()-dislikesControl > 5000) {
            cancion.cambiarEstado(new Normal(cancion, reproducciones, likes, dislikes, horasSinReproduccion));
        }
    }

}
