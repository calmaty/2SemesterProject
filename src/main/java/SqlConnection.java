import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {
    private static final String userName = ""; //Insert PostgreSQL id and password
    private static final String passWord = "";
    private static Connection connection;

    private static void initializeConnection() {
        try {
            connection = DriverManager.getConnection(
                    "", userName, passWord);
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