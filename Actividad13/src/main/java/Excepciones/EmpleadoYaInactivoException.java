package Excepciones; 

public class EmpleadoYaInactivoException extends Exception {
    public EmpleadoYaInactivoException() {
        super("El empleado esta inactivo");
    }
    
    public EmpleadoYaInactivoException(String mensaje) {
        super(mensaje);
    }
}