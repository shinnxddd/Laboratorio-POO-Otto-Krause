package dao.empleadoDaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.Dao;
import model.Empleado;

public class EmpleadoDao implements Dao {

    private static final String URL = "jdbc:mysql://localhost:3307/globant_db?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    public Connection conexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }

    public EmpleadoDao() {
        try (Connection conexion = conexion(); Statement stmt = conexion.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS empleados (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nombre VARCHAR(50) NOT NULL, " +
                    "apellido VARCHAR(50) NOT NULL, " +
                    "dni INT NOT NULL UNIQUE, " +
                    "cargo VARCHAR(30) NOT NULL, " +
                    "salario DOUBLE NOT NULL, " +
                    "activo BOOLEAN NOT NULL DEFAULT TRUE)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createbro(Empleado e) {
        String sql = "INSERT INTO empleados (nombre, apellido, dni, cargo, salario, activo) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conexion().prepareStatement(sql)) {
            ps.setString(1, e.getNombre());
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCargo());
            ps.setDouble(5, e.getSalario());
            ps.setBoolean(6, e.isActivo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void updatebro(Empleado e) {
        String sql = "UPDATE empleados SET nombre = ?, apellido = ?, dni = ?, cargo = ?, salario = ?, activo = ? WHERE id = ?";
        try (PreparedStatement ps = conexion().prepareStatement(sql)) {
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCargo());
            ps.setDouble(5, e.getSalario());
            ps.setBoolean(6, e.isActivo());
            ps.setInt(7, e.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deletebro(int id) {
        String sql = "UPDATE empleados SET activo = false WHERE id = ?";
        try (PreparedStatement ps = conexion().prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Empleado ListarPorId(int id) {
        String sql = "SELECT * FROM empleados WHERE id = ?";
        Empleado empleadolol = null;
        try (PreparedStatement ps = conexion().prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                empleadolol = new Empleado(
                    rs.getInt("id:"),
                    rs.getString("nombre: "),
                    rs.getString("apellido: "),
                    rs.getInt("dni: "),
                    rs.getString("cargo: "),
                    rs.getDouble("salario: "),
                    rs.getBoolean("activo: ")
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return empleadolol;
    }
    
    @Override
    public List<Empleado> ListarTodo() {
        List<Empleado> lista = new ArrayList<>();
        String sql = "SELECT * FROM empleados WHERE activo = true";
        try (Connection conexion = conexion(); 
             Statement st = conexion.createStatement(); 
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Empleado empleadolol = new Empleado(
                    rs.getInt("id: "),
                    rs.getString("nombre: "),
                    rs.getString("apellido: "),
                    rs.getInt("dni: "),
                    rs.getString("cargo: "),
                    rs.getDouble("salario: "),
                    rs.getBoolean("activo: ")
                );
                lista.add(empleadolol);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    @Override
    public Empleado BuscarPorDni(int dni) {
        String sql = "SELECT * FROM empleados WHERE dni = ?";
        Empleado empleadolol = null;
        try (Connection conexion = conexion(); PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                empleadolol = new Empleado(
                    rs.getInt("id: "),
                    rs.getString("nombre: "),
                    rs.getString("apellido: "),
                    rs.getInt("dni: "),
                    rs.getString("cargo: "),
                    rs.getDouble("salario: "),
                    rs.getBoolean("activo: ")
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return empleadolol;
    }
}