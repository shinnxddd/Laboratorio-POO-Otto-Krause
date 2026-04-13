package nuevoproyecto;

class Moto extends Vehiculo {

    private String cilindrado;

    public Moto(int patente, String modelo, int cant_ruedas, String volante, int caballosfuerza, String cilindrado) {
        super(patente, modelo, cant_ruedas, volante, caballosfuerza);
        this.cilindrado = cilindrado;
    }

    public void hacerwilly() {
        System.out.println("Haciendo willy...");
    }
}