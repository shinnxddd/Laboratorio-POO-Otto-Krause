package nuevoproyecto;

public class Main {

    public static void main(String[] args) {

        
    	HerramientaElectrica h1 = new HerramientaElectrica(1, "amoladora", 220);
    	HerramientaElectrica h2 = new HerramientaElectrica(2, "agujereadora", 110);
    	HerramientaManual h3 = new HerramientaManual(3, "destornillador", "metal");
    	HerramientaManual h4 = new HerramientaManual(4, "martillo", "metal");
    	HerramientaManual h5 = new HerramientaManual(5, "llave inglesa", "metal");

       
        h1.usar();
        h2.usar();
        h3.usar();

        
        h1.devolver();
        h4.devolver();

     
        ((HerramientaElectrica) h1).conectar();
        ((HerramientaElectrica) h2).conectar();
    }
}

