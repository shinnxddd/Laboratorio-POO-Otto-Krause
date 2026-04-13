package nuevoproyecto;

import java.util.ArrayList;

public class Vendedor {
    private String nombre;
    private String apellido;
    private ArrayList<Vehiculo> autosvendidos;
    private String concesionaria;
    private int telefono;

    public Vendedor(String nombre, String apellido, String concesionaria, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.concesionaria = concesionaria;
        this.telefono = telefono;
        this.autosvendidos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        autosvendidos.add(v);
    }

    public void mostrarVehiculos() {
        System.out.println("Vehículos que vendio " + nombre + ": " + autosvendidos.size());
    }
}