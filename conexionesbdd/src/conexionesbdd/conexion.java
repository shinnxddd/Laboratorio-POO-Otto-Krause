package conexionesbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private static String url =
            "jdbc:mysql://localhost:3306/tablas?useSSL=false&serverTimezone=UTC";

    private static String usuario = "root";
    private static String password = "";

    public static Connection conexion() throws SQLException {
        return DriverManager.getConnection(url, usuario, password);
    }
}
