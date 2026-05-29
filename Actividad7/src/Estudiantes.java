import java.util.*;
public class Estudiantes {
   protected String dni;
   protected String nombre;
   protected double promedio;
  
  
   public Estudiantes(String dni, String nombre, double promedio) {      
       this.dni = dni;
       this.nombre = nombre;
       this.promedio = promedio;
       }
   
   public String getnombre() {
   	return nombre;
   }
   
   public double getpromedio () {
   	return promedio;
   }
   
   public void mostrarFicha() {
       System.out.println("Nombre del estudiante: " + nombre);
       System.out.println("DNI del estudiante: " + dni);
       System.out.println("Promedio del estudiante: " + promedio);
   }
}
