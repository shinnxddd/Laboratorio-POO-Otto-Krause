package nuevoproyecto;


abstract class Herramienta {

    protected int codigo;
    protected String tipoh;

    public Herramienta(int codigo, String tipoh) {
        this.codigo = codigo;
        this.tipoh = tipoh;
    }

    public void usar() {
        System.out.println("Usando herramienta: " + tipoh);
    }

    public void devolver() {
        System.out.println("Devolviendo herramienta: " + tipoh);
    }
}


