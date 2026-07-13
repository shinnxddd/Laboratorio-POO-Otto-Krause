public class Cantante {
	private String nombre;
	private String generoMusical;
	private int cachet;
	private int cantCanciones;
	private String manager;

	public Cantante(String nombre, String generoMusical, int cachet, int cantCanciones, String manager) {
		this.nombre=nombre;
		this.generoMusical=generoMusical;
		this.cachet=cachet;
		this.cantCanciones=cantCanciones;
		this.manager=manager;
	}

	public void liquidarHonorarios(double impuestos) {
		if (impuestos < 0 || impuestos > 100) {
			throw new IllegalArgumentException("Ese porcentaje de impuestos es invalido.");
		} else {
			System.out.println("Los honorarios del cantante " + nombre + " ya fueron liquidados.");
		}
	}

	public void asignarEscenario(String nombreEscenario) {
		if (nombreEscenario == null) {
			throw new NullPointerException ("El escenario esta vacío");
		}
		System.out.println("El artista " + nombre + " va al escenario " + nombreEscenario);
	}

	public void realizarSoundcheck() throws EspectaculoCortoException {
		if (cantCanciones<5) {
			throw new EspectaculoCortoException("El cantante " + nombre + " tiene menos de 5 canciones.");
		}
		System.out.println("El cantante " + nombre +" hizo el soundcheck.");
	}

	public void mostrarManager () {
		if (manager == null) {
			throw new NullPointerException ("No hay manager, no se puede proceder.");
		}

	}
}
