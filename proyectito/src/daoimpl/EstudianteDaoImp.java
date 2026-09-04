package Dao.DaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Dao.EstudianteDao;
import Model.Estudiante;

public class EstudianteDaoImp implements EstudianteDao {

    public Connection conexionbdd() {
    	private static String url =
    			"jdbc:mysql://localhost:3307/tablas?useSSL=false&serverTimezone=UTC";
    			private static String usuario = "root";
    			private static String password = "";

    			public static Connection conexionbdd() throws SQLException{ 
    					return DriverManager.getConnection(url, usuario, password);
    			}
    			public Connection conexion() {
    				return DriverManager.getConnection(url, usuario, password);
    			}
 
    }

    public EstudianteDaoImp() {

        try (Connection con = conexionbdd(); Statement stmt = con.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS estudiante (" +
                         "id INT AUTO_INCREMENT PRIMARY KEY, " +
                         "nombre VARCHAR(50), " +
                         "apellido VARCHAR(50), " +
                         "dni INT, " +
                         "curso VARCHAR(50))");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void Crear(Estudiante e) {
        String sql = "INSERT INTO estudiante (nombre, apellido, dni, curso) VALUES (?, ?, ?, ?)";
        try (Connection con = ConexionBd(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCurso());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void Actualizar(Estudiante e) {
        String sql = "UPDATE estudiante SET nombre = ?, apellido = ?, dni = ?, curso = ? WHERE id = ?";
        try (Connection con = ConexionBd(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setInt(4, e.getCurso());
            ps.setInt(5, e.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void Eliminar(int id) {
        String sql = "DELETE FROM estudiante WHERE id = ?";
        try (Connection con = ConexionBd(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Estudiante ListarPorId(int id) {
        String sql = "SELECT * FROM estudiante WHERE id = ?";
        Estudiante est = null;
        try (Connection con = ConexionBd(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                est = new Estudiante(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getInt("dni"),
                    rs.getString("curso")
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return est;
    }

    @Override
    public List<Estudiante> ListarTodo() {
        List<Estudiante> lista = new ArrayList<>();
        String sql = "SELECT * FROM estudiante";
        try (Connection con = ConexionBd(); 
             Statement st = con.createStatement(); 
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Estudiante est = new Estudiante(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getInt("dni"),
                    rs.getString("curso")
                );
                lista.add(est);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
}