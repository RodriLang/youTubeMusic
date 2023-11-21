package entidades;

import tendenciasMusicales.Normal;
import tendenciasMusicales.TendenciaMusical;

public class Cancion {

    private String titulo;
    private String genero;
    private Artista autor;
    private String duracion;
    private TendenciaMusical estado;

    public Cancion(String titulo, String genero, Artista autor, String duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.duracion = duracion;
        this.estado = new Normal(this);
        System.out.println("icono en cancion"+estado.getIcono());
    }

    public void cambiarEstado(TendenciaMusical estado) {
        this.estado = estado;
    }

    public TendenciaMusical getEstado() {
        return estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Artista getAutor() {
        return autor;
    }

    public void setAutor(Artista autor) {
        this.autor = autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return titulo+" "+estado+"\n"+duracion+"\n"+genero+"\n"+autor;
    }
}
