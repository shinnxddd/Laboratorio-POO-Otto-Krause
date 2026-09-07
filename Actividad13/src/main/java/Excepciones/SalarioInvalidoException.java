package Excepciones; 

public class SalarioInvalidoException extends Exception {
	public SalarioInvalidoException() {
		super("El salario ingresado es invalido");
		
	}
	public SalarioInvalidoException(String mensaje) {
		super(mensaje);
	}
}
