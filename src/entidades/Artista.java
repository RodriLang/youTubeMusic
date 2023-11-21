package entidades;

public class Artista {

    private String nombre;
    private String apellido;

    public Artista(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }

}
