package Excepciones; 

public class DniDuplicadoException extends Exception {
	public DniDuplicadoException() {
		super("El DNI ingresado es esta duplicado");
		
	}
	public DniDuplicadoException(String mensaje) {
		super(mensaje);
	}
}
