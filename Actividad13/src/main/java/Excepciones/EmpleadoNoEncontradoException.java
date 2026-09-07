package Excepciones; 

public class EmpleadoNoEncontradoException extends Exception {
	public EmpleadoNoEncontradoException() {
		super("El empleado se perdio D:");
		
	}
	public EmpleadoNoEncontradoException(String mensaje) {
		super(mensaje);
	}
}
