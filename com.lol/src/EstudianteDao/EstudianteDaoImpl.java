package EstudianteDao;
public class EstudianteDaoImpl { 

    private static String url =
            "jdbc:mysql://localhost:3307/estudiantes?useSSL=false&serverTimezone=UTC";

    private static String usuario = "root";
    private static String password = "";

    public static Connection conexion() throws SQLException {
        return DriverManager.getConnection(url, usuario, password);
    }

    public static void createbro(Estudiante e) {

        String sql = "INSERT INTO tablas " +
                "(nombre, apellido, id, dni, curso) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps =
                     conexion().prepareStatement(sql)) { 

            ps.setString(1, e.getnombre());
            ps.setString(2, e.getapellido());
            ps.setInt(3, e.getid());
            ps.setString(4, e.getdni());
            ps.setBoolean(5, e.getcurso());
            
            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}