package Service;

import java.util.List;
import Dao.EstudianteDao;
import Dao.DaoImpl.EstudianteDaoImp;
import Model.Estudiante;

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