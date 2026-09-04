package main;

import service.EstudianteService;

public class Main {
	
    public static void main(String[] args) {
        EstudianteService service = new EstudianteService();

        //prueba poara vber si sirve poq no sirbveeeeeee
        service.Registrar(1, "nagi", "seishiro", 1010101010, "5to 2da");
        System.out.println("Lista de estudiantes:");
        service.ListarTodo().forEach(System.out::println);
    }
}

