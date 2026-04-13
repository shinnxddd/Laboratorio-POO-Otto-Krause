package pollofrito;

public class Libro {
    private int ISBN;
    private String titulo;
    private String genero;

    public Libro(int ISBN, String titulo, String genero) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }
}