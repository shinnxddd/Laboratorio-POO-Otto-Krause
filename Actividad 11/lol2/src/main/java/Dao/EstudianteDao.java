package Dao;

import java.util.List;
import Model.Estudiante;

public interface EstudianteDao {
    void crear(Estudiante e);
    void actualizar(Estudiante e);
    void eliminar(int id);
    Estudiante listarPorId(int id);
    List<Estudiante> listarTodo();
}
