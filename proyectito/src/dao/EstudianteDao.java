package Dao;

import java.util.List;
import Model.Estudiante;

public interface EstudianteDao {
    void Crear(Estudiante e);
    void Actualizar(Estudiante e);
    void Eliminar(int id);
    Estudiante ListarPorId(int id);
    List<Estudiante> ListarTodo();
}