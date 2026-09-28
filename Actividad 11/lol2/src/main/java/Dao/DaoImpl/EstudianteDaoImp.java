package Dao.DaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.EstudianteDao;
import Model.Estudiante;

public class EstudianteDaoImp implements EstudianteDao {

    private final String url = "jdbc:mysql://localhost:3306/estudiante?useSSL=false&serverTimezone=UTC";
    private final String usuario = "root";
    private final String password = "";

    private Connection conexionBd() throws SQLException {
        return DriverManager.getConnection(url, usuario, password);
    }

    @Override
    public void crear(Estudiante e) {
        String sql = "INSERT INTO alumnos (nombre, apellido, dni, curso) VALUES (?, ?, ?, ?)";

        try (Connection conexion = conexionBd();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCurso());

            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas insertadas: " + filasAfectadas);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actualizar(Estudiante e) {
        String sql = "UPDATE alumnos SET nombre = ?, apellido = ?, dni = ?, curso = ? WHERE id = ?";

        try (Connection conexion = conexionBd();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCurso());
            ps.setInt(5, e.getId());

            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas actualizadas: " + filasAfectadas);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM alumnos WHERE id = ?";

        try (Connection conexion = conexionBd();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, id);

            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas eliminadas: " + filasAfectadas);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Estudiante listarPorId(int id) {
        String sql = "SELECT id, nombre, apellido, dni, curso FROM alumnos WHERE id = ?";
        Estudiante estudiante = null;

        try (Connection conexion = conexionBd();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    estudiante = new Estudiante(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getInt("dni"),
                            rs.getString("curso")
                    );
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return estudiante;
    }

    @Override
    public List<Estudiante> listarTodo() {
        String sql = "SELECT id, nombre, apellido, dni, curso FROM alumnos";
        List<Estudiante> lista = new ArrayList<>();

        try (Connection conexion = conexionBd();
             PreparedStatement ps = conexion.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Estudiante e = new Estudiante(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getString("curso")
                );
                lista.add(e);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
    }
}
