package pollofrito;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private int codigo;
    private ArrayList<Libro> libros;

    public Socio(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibro() {
        System.out.println("Socio: " + nombre);

        for (Libro l : libros) {
            System.out.println(" - " + l.getTitulo() + " (" + l.getGenero() + ")");
        }
    }
}