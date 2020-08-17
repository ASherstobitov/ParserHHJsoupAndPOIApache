

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {
    public final String HOST = "jdbc:postgresql://localhost:5432/TeamDB";
    public final String USERNAME = "postgres";
    public final String PASSWORD = "Iliay1907";


    public Connection getConnection() {
        return connection;
    }

    private Connection connection;


    public DBWorker() {
        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
