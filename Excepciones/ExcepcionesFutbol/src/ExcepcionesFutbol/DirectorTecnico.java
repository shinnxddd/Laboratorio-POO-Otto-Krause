package ExcepcionesFutbol;

public class DirectorTecnico {
    private String nombre;

    public DirectorTecnico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Director Técnico: " + nombre;
    }
}
