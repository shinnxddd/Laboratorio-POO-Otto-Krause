package nuevoproyecto;

class HerramientaElectrica extends Herramienta {

    private int voltaje;

    public HerramientaElectrica(int codigo, String tipoh, int voltaje) {
        super(codigo, tipoh);
        this.voltaje = voltaje;
    }

    public void conectar() {
        System.out.println("Conectando herramienta de " + voltaje);
    }
}
