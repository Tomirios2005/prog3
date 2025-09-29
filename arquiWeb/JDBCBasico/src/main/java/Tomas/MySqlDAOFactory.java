package Tomas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDAOFactory {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/exampleDB";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(DRIVER); // Carga el driver
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("No se encontró el driver JDBC", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
