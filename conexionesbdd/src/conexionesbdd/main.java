package conexionesbdd;
import java.sql.*;
public class main {

    public static void main(String[] args) {

        try {
            conexion.conexion();
            System.out.println("conectaste bro");

            createbro();
            deletebro();
            updatebro();
            readbro();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createbro() {

        String sql = "INSERT INTO vendedores " +
                "(nombre, apellido, dni, rubro, actual) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps =
                     conexion.conexion().prepareStatement(sql)) {

            ps.setString(1, "Rubio");
            ps.setString(2, "Naruto");
            ps.setString(3, "11111111");
            ps.setString(4, "veterinaria");
            ps.setBoolean(5, true);
            ps.executeUpdate();

            ps.setString(1, "murasakibara");
            ps.setString(2, "atsushi");
            ps.setString(3, "22222222");
            ps.setString(4, "basquet");
            ps.setBoolean(5, true);
            ps.executeUpdate();

            ps.setString(1, "rin");
            ps.setString(2, "itoshi");
            ps.setString(3, "33333333");
            ps.setString(4, "futbolista");
            ps.setBoolean(5, true);
            ps.executeUpdate();

            ps.setString(1, "gaara");
            ps.setString(2, "delarena");
            ps.setString(3, "44444444");
            ps.setString(4, "kazekage");
            ps.setBoolean(5, false);
            ps.executeUpdate();

            ps.setString(1, "mitsuki");
            ps.setString(2, "kiryu");
            ps.setString(3, "77777777");
            ps.setString(4, "pandillero");
            ps.setBoolean(5, true);
            ps.executeUpdate();

            System.out.println("se metieron a los vendedores");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readbro() {

        String query = "SELECT * FROM vendedores";

        try (PreparedStatement ps =
                     conexion.conexion().prepareStatement(query)) {

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {

                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    String dni = rs.getString("dni");
                    String rubro = rs.getString("rubro");
                    boolean actual = rs.getBoolean("actual");

                    System.out.println(id + " " + nombre + " " + apellido + " " + dni + " " + rubro + " " + actual);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updatebro() {

        String sql = "UPDATE vendedores " +
                "SET apellido = ?, rubro = ? " +
                "WHERE id = ?";

        try (PreparedStatement ps =
                     conexion.conexion().prepareStatement(sql)) {

            ps.setString(1, "uzumaki");
            ps.setString(2, "lolero");
            ps.setInt(3, 2);
            
            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas actualizadas: " + filasAfectadas);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletebro() {

        String sql = "DELETE FROM vendedores WHERE id = ?";

        try (PreparedStatement ps =
                     conexion.conexion().prepareStatement(sql)) {

            ps.setInt(1, 4);
            int filasAfectadas = ps.executeUpdate();
            
            System.out.println("Filas eliminadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
