package Service;

import java.util.List;
import Dao.EstudianteDao;
import Dao.DaoImpl.EstudianteDaoImp;
import Model.Estudiante;

package main;

import Service.EstudianteService;

public class Main {
	
    public static void Main(String[] args) {
        EstudianteService service = new EstudianteService();

        //prueba poara vber si sirve poq no sirbveeeeeee
        service.Registrar("nagi", "seishiro", 1010101010, "5to 2da");

        System.out.println("Lista de estudiantes:");
        service.ListarTodo().forEach(System.out::println);
    }
}

public class EstudianteService {

    private EstudianteDao dao;

    public EstudianteService() {
        this.dao = new EstudianteDaoImp();
    }

    public void Registrar(String nombre, String apellido, int dni, String curso) {
        Estudiante e = new Estudiante(nombre, apellido, dni, curso);
        dao.Crear(e);
    }

    public void Actualizar(int id, String nombre, String apellido, int dni, String curso) {
        Estudiante e = new Estudiante(id, nombre, apellido, dni, curso);
        dao.Actualizar(e);
    }

    public void Eliminar(int id) {
        dao.Eliminar(id);
    }

    public Estudiante ListarPorId(int id) {
        return dao.ListarPorId(id);
    }

    public List<Estudiante> ListarTodo() {
        return dao.ListarTodo();
    }
}