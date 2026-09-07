package dao;

import java.util.List;
import model.Empleado;

public interface Dao {
    void createbro(Empleado e);
    void updatebro(Empleado e);
    void deletebro(int id); 
    Empleado ListarPorId(int id);
    List<Empleado> ListarTodo(); 
    Empleado BuscarPorDni(int dni);
}