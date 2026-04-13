package nuevoproyecto;


class HerramientaManual extends Herramienta {

    private String tipoEmpunadura;

    public HerramientaManual(int codigo, String tipoh, String tipoEmpunadura) {
        super(codigo, tipoh);
        this.tipoEmpunadura = tipoEmpunadura;
    }
}

