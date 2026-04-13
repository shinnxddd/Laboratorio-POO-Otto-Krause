package nuevoproyecto;

abstract class Vehiculo {

    private int patente;
    private String modelo;
    private int cant_ruedas;
    private String volante;
    private int caballosfuerza;

    public Vehiculo(int patente, String modelo, int cant_ruedas, String volante, int caballosfuerza) {
        this.patente = patente;
        this.modelo = modelo;
        this.cant_ruedas = cant_ruedas;
        this.volante = volante;
        this.caballosfuerza = caballosfuerza;
    }

    public void encender() {
        System.out.println("Encendiendo..");
    }
}