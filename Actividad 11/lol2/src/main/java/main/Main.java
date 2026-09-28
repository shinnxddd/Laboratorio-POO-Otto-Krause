package main;

import java.util.List;

import Model.Estudiante;
import Service.EstudianteService;

public class Main {
    public static void main(String[] args) {
        EstudianteService service = new EstudianteService();


        service.registrar("Leon", "Kennedy", 17635895, "6° 2°");
        service.registrar("Claire", "Redfield", 20456123, "6° 1°");
        service.registrar("Chris", "Redfield", 18789456, "5° 3°");
        service.registrar("Jill", "Valentine", 19345678, "5° 2°");
        service.registrar("Ada", "Wong", 21654987, "6° 3°");
        service.registrar("Ethan", "Winters", 22987654, "4° 1°");
        service.registrar("Mia", "Winters", 23123456, "4° 2°");
        service.registrar("Carlos", "Oliveira", 24456789, "5° 1°");
        service.registrar("Sherry", "Birkin", 25789123, "6° 2°");
        service.registrar("Rebecca", "Chambers", 26321654, "4° 3°");


        System.out.println("\n--- Listado completo ---");
        listar(service);

        System.out.println("\n--- Eliminando id 4 ---");
        service.eliminar(4);

        System.out.println("\n--- Actualizando id 6 ---");
        service.actualizar(6, "Ethan", "Winters", 22987654, "5° 1°");

        System.out.println("\n--- Actualizando id 8 ---");
        service.actualizar(8, "Carlos", "Oliveira", 24456789, "6° 1°");

        System.out.println("\n--- Listado luego de los cambios ---");
        listar(service);
    }

    private static void listar(EstudianteService service) {
        List<Estudiante> estudiantes = service.listarTodo();
        for (Estudiante e : estudiantes) {
            System.out.println(e.getId() + " - " + e.getNombre() + " " + e.getApellido()
                    + " - DNI: " + e.getDni() + " - Curso: " + e.getCurso());
        }
    }
}
