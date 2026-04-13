package nuevoproyecto;

class Autos extends Vehiculo {

    private int puertas;
    private String tipo_c_cambio;

    public Autos(int patente, String modelo, int cant_ruedas, String volante, int caballosfuerza, int puertas, String tipo_c_cambio) {
        super(patente, modelo, cant_ruedas, volante, caballosfuerza);
        this.puertas = puertas;
        this.tipo_c_cambio = tipo_c_cambio;
    }

    public void derrapar() {
        System.out.println("Derrapando..");
    }
}