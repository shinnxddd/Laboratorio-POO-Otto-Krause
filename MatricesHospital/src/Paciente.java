public class Paciente {
	private String nombre;
	private int dni;
	private int edad;
	private double peso;
	private boolean estaHospitalizado;
	
	public Paciente(String nombre, int dni, int edad, double peso, boolean estaHospitalizado) {      
	       this.nombre = nombre;
	       this.dni = dni;
	       this.edad = edad;
	       this.peso = peso;
	       this.estaHospitalizado = estaHospitalizado;
	       }
	
	  public String getnombre() {
		   	return nombre;
		   }
	  
	  public int dni() {
		   	return dni;
		   }
	  
	  
	  public int edad() {
		   	return edad;
		   }
	  
	  public double peso() {
		   	return peso;
		   }
	  
	  public boolean estaHospitalizado() {
		   	return estaHospitalizado;
		   }
	  
	  public void mostrarPaciente() {
		  System.out.println("Nombre del paciente: " + this.nombre);
		  System.out.println("Dni del paciente: " + this.dni);
		  System.out.println("Edad del paciente: " + this.edad);
		  System.out.println("Peso del paciente: " + this.peso);
		  System.out.println("Estado del paciente (Hospítalizado si o no): " + this.estaHospitalizado);
	  }
}
