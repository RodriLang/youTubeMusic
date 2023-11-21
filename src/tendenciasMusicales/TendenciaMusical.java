package tendenciasMusicales;

import entidades.Cancion;
import java.time.LocalDateTime;
import javax.swing.Icon;

public abstract class TendenciaMusical {

    protected Icon icono;
    protected String leyenda;
    protected Cancion cancion;
    protected int reproducciones;
    protected int likes;
    protected int dislikes;
    public int horasSinReproduccion;

    public TendenciaMusical(Cancion cancion) {
        this.cancion = cancion;
        cargarDatosCancion();
    }

    public TendenciaMusical(Cancion cancion, int reproducciones, int likes, int dislikes, int horasSinReproduccion) {
        this.cancion = cancion;
        this.reproducciones = reproducciones;
        this.likes = likes;
        this.dislikes = dislikes;
        this.horasSinReproduccion = horasSinReproduccion;
    }

    public Icon getIcono() {
        return icono;
    }

    public void setIcono(Icon icono) {
        this.icono = icono;
    }

    protected void cargarDatosCancion() {
        leyenda = cancion.getTitulo() + " - " + cancion.getAutor().toString();
    }

    public void medirPopularidad() {
        cancion.cambiarEstado(this);
    }

    public String getLeyenda() {
        return leyenda;
    }

    public void setLeyenda(String leyenda) {
        this.leyenda = leyenda;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
        cargarDatosCancion();
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    @Override
    public String toString() {
        return icono + " " + leyenda;
    }

    public int getHorasSinReproduccion() {
        return horasSinReproduccion;
    }

    public void setHorasSinReproduccion(int horasSinReproduccion) {
        this.horasSinReproduccion = horasSinReproduccion;
    }

}
