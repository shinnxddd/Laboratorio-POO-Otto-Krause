package ExcepcionesFutbol;

import java.util.ArrayList;

public class Mundial {
    private ArrayList<Seleccion> selecciones;

    public Mundial() {
        this.selecciones = new ArrayList<>();
    }

    public void agregarSeleccion(Seleccion s) {
        selecciones.add(s);
    }


    public void consultarPorPosicion(int indice) {

        Seleccion s = selecciones.get(indice); 
        System.out.println("Selección encontrada: " + s.getnombre());
    }


    public void actualizarPuntos(int indice, int puntosactualizados) {
        try {
            Seleccion s = selecciones.get(indice);
            s.setpuntos(puntosactualizados);
            System.out.println("Puntos actualizados con éxito para " + s.getnombre() + ". Total: " + s.getpuntos());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No se pudo actualizar pudo actualizar porque esa posicion (" + indice + ")  no existe.");
        }
    }

//aca le pedi ayuda a la ia pq no entendi como 

public void consultarDirectorTecnico(int indice) {
    Seleccion s = selecciones.get(indice);

    System.out.println("DT: " + s.getdirectorTecnico().toString());
}

public ArrayList<Seleccion> getselecciones() {
    return selecciones;
}
}
