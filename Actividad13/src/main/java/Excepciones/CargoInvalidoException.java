package Excepciones; 

public class CargoInvalidoException extends Exception {
	public CargoInvalidoException() {
		super("El cargo ingresado es invalido");
		
	}
	public CargoInvalidoException(String mensaje) {
		super(mensaje);
	}
}
