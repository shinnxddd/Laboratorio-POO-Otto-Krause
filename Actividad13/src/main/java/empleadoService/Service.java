package empleadoService;

import java.util.Arrays;
import java.util.List;

import dao.Dao;
import dao.empleadoDaoImpl.EmpleadoDao;
import Excepciones.CargoInvalidoException;
import Excepciones.DniDuplicadoException;
import Excepciones.DniInvalidoException;
import Excepciones.EmpleadoNoEncontradoException;
import Excepciones.EmpleadoYaInactivoException;
import Excepciones.SalarioInvalidoException;
import model.Empleado;

public class Service {

    private Dao dao;
    private static final List<String> CARGOS_PERMITIDOS = Arrays.asList("Analista", "Desarrollador", "Gerente", "Soporte");

    public Service() {
        this.dao = new EmpleadoDao();
    }

    public void createbro(String nombre, String apellido, int dni, String cargo, double salario)
            throws DniInvalidoException, DniDuplicadoException, SalarioInvalidoException, CargoInvalidoException {
        
        validarDni(dni);
        if (dao.BuscarPorDni(dni) != null) {
            throw new DniDuplicadoException();
        }
        validarSalario(salario);
        validarCargo(cargo);

        Empleado nuevoemp = new Empleado(nombre, apellido, dni, cargo, salario, true);
        dao.createbro(nuevoemp);
    }

    public void updatebro(int id, String nombre, String apellido, int dni, String cargo, double salario)
            throws EmpleadoNoEncontradoException, DniInvalidoException, DniDuplicadoException, SalarioInvalidoException, CargoInvalidoException {
        
        Empleado existente = dao.ListarPorId(id);
        if (existente == null) {
            throw new EmpleadoNoEncontradoException();
        }

        validarDni(dni);
        
        Empleado empleadoconDni = dao.BuscarPorDni(dni);
        if (empleadoconDni != null && empleadoconDni.getId() != id) {
            throw new DniDuplicadoException();
        }
        
        validarSalario(salario);
        validarCargo(cargo);

        existente.setNombre(nombre);
        existente.setApellido(apellido);
        existente.setDni(dni);
        existente.setCargo(cargo);
        existente.setSalario(salario);

        dao.updatebro(existente);
    }

    public void deletebro(int id) throws EmpleadoNoEncontradoException, EmpleadoYaInactivoException {
        Empleado existente = dao.ListarPorId(id);
        if (existente == null) {
            throw new EmpleadoNoEncontradoException();
        }
        if (!existente.isActivo()) {
            throw new EmpleadoYaInactivoException();
        }

        dao.deletebro(id);
    }

    public Empleado ListarPorId(int id) throws EmpleadoNoEncontradoException {
        Empleado empleadolol = dao.ListarPorId(id);
        if (empleadolol == null) {
            throw new EmpleadoNoEncontradoException();
        }
        return empleadolol;
    }

    public List<Empleado> ListarTodo() {
        return dao.ListarTodo();
    }

    private void validarDni(int dni) throws DniInvalidoException {
        int longitud = String.valueOf(dni).length();
        if (longitud < 7 || longitud > 8) {
            throw new DniInvalidoException();
        }
    }

    private void validarSalario(double salario) throws SalarioInvalidoException {
        if (salario <= 0) {
            throw new SalarioInvalidoException();
        }
    }

    private void validarCargo(String cargo) throws CargoInvalidoException {
        if (cargo == null || !CARGOS_PERMITIDOS.contains(cargo)) {
            throw new CargoInvalidoException();
        }
    }
}