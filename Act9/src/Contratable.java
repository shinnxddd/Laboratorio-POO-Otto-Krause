public interface Contratable
{
	void liquidarHonorarios(double impuestos) 
	throws IllegalArgumentException;
	
	void asignarEscenario(String nombreEscenario) 
	throws NullPointerException;
}

