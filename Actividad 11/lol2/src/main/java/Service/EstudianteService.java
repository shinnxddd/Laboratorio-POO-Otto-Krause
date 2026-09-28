package Service;

import java.util.List;

import Dao.EstudianteDao;
import Dao.DaoImpl.EstudianteDaoImp;
import Model.Estudiante;

public class EstudianteService {

    private final EstudianteDao estudianteDao;

    public EstudianteService() {
        this.estudianteDao = new EstudianteDaoImp();
    }

    public void registrar(String nombre, String apellido, int dni, String curso) {
        Estudiante e = new Estudiante(nombre, apellido, dni, curso);
        estudianteDao.crear(e);
    }

    public void actualizar(int id, String nombre, String apellido, int dni, String curso) {
        Estudiante e = new Estudiante(id, nombre, apellido, dni, curso);
        estudianteDao.actualizar(e);
    }

    public void eliminar(int id) {
        estudianteDao.eliminar(id);
    }

    public Estudiante listarPorId(int id) {
        return estudianteDao.listarPorId(id);
    }

    public List<Estudiante> listarTodo() {
        return estudianteDao.listarTodo();
    }
}
