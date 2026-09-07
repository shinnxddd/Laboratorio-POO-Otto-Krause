package Excepciones; 

public class DniInvalidoException extends Exception {
	public DniInvalidoException() {
		super("El DNI ingresado es invalido");
		
	}
	public DniInvalidoException(String mensaje) {
		super(mensaje);
	}
}

