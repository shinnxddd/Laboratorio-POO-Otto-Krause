import java.util.*;
public class Curso {
	private String nombre;
	private List <Estudiantes> alumnos;
	public Curso(String nombre) {
		this.nombre = nombre;
	
	
	alumnos = new ArrayList<>();
	}
	
   public void inscribirEstudiantes(Estudiantes e) {
       alumnos.add(e);
   }
   
   public void darDeBaja(int indice) {
	   alumnos.remove(indice);
   }
   
   public void listarAlumnos() {
	   for(Estudiantes e : alumnos) {
           e.mostrarFicha();
	   }
   }
   
   public int cantidadAlumnos() {
	   return alumnos.size();
   }
   
   public List<Estudiantes> getalumnos() { 
       return alumnos;
   }
   
}
