public class Main {
	public static void main(String[] args) {
		
		Curso cur1 = new Curso("5°2");
		Estudiantes estu1 = new Estudiantes("2000", "Shotaro", 9.4);
		Estudiantes estu2 = new Estudiantes("1880", "Heidi", 5.5);
		Estudiantes estu3 = new Estudiantes("1977", "Leon Kennedy", 10);
		
		
        cur1.inscribirEstudiantes(estu1);
        cur1.inscribirEstudiantes(estu2);
        cur1.inscribirEstudiantes(estu3);
        
        System.out.println("Cantidad de alumnos en el curso: " + cur1.cantidadAlumnos());
        
        cur1.listarAlumnos();
        
        System.out.println("Lista con el segundo estudiante borrado:");
        
        cur1.darDeBaja(1);
        
        cur1.listarAlumnos();
                
	}
}
