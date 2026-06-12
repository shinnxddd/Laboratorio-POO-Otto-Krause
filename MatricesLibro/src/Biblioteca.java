import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> inventarioLibros;

    public Biblioteca() {

        inventarioLibros = new ArrayList<>();
    }

    public void agregarLibro(Libro l) {

        inventarioLibros.add(l);
    }

    public void listarlos() {

        for (Libro l : inventarioLibros) {

            l.mostrarProdu();
        }
    }

    public int cantidadLibros() {

        return inventarioLibros.size();
    }
}
