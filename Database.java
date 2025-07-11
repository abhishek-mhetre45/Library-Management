import java.sql.*;

public class Database {
    private static final String URL = "jdbc:postgresql://localhost:5432/library_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}