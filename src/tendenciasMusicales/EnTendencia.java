package tendenciasMusicales;

import entidades.Cancion;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;

public class EnTendencia extends TendenciaMusical {

    public EnTendencia(Cancion cancion) {
        super(cancion);
        icono = icono = new ImageIcon(getClass().getResource("/imagenes/fuego.png"));
        horasSinReproduccion = 0;
    }
    public EnTendencia(Cancion cancion, int reproducciones, int likes, int dislikes, int horasSinReproduccion) {
        super(cancion, reproducciones, likes, dislikes, horasSinReproduccion);
        icono = icono = new ImageIcon(getClass().getResource("/imagenes/fuego.png"));
        horasSinReproduccion = 0;
    }

    @Override
    public void medirPopularidad() {
        System.out.println("horas sin reproduccion: " + horasSinReproduccion);
        if (horasSinReproduccion >= 24) {
            cancion.cambiarEstado(new Normal(cancion, reproducciones, likes, dislikes, horasSinReproduccion));
        }
    }

}
