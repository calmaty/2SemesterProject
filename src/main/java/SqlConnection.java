import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {
    private static final String userName = "postgres"; //Insert PostgreSQL id and password
    private static final String passWord = "1234";
    private static Connection connection;

    private static void initializeConnection() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres", userName, passWord);
        } catch (SQLException e) {
            System.out.println(" Connection not initialized , check database server and credentials !");

        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            initializeConnection();
        }
        return connection;
    }

    public static void releaseConnection(Connection con) {
        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}