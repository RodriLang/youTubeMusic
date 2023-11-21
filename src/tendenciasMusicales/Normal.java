package tendenciasMusicales;

import entidades.Cancion;
import javax.swing.ImageIcon;

public class Normal extends TendenciaMusical {

    private int reproduccionesControl;

    public Normal(Cancion cancion) {
        super(cancion);
        icono = new ImageIcon(getClass().getResource("/imagenes/notas.png"));
        reproduccionesControl = reproducciones;
    }

    public Normal(Cancion cancion, int reproducciones, int likes, int dislikes, int horasSinReproduccion) {
        super(cancion, reproducciones, likes, dislikes, horasSinReproduccion);
        icono = new ImageIcon(getClass().getResource("/imagenes/notas.png"));
        reproduccionesControl = reproducciones;
    }

    @Override
    public void medirPopularidad() {
        System.out.println("reproducciones" + reproduccionesControl);
        if (cancion.getEstado().getReproducciones() - reproduccionesControl > 1000) {
            cancion.cambiarEstado(new EnAuge(cancion, reproducciones, likes, dislikes, horasSinReproduccion));
        }
    }

}
