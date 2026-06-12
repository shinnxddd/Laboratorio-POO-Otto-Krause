import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> listaDeProductos;

    public Inventario() {

        listaDeProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {

        listaDeProductos.add(p);
    }

    public void listarlos() {

        for (Producto p : listaDeProductos) {

            p.mostrarProdu();
        }
    }

    public int cantidadProductos() {

        return listaDeProductos.size();
    }
}

