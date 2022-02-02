package BankingApplication.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static Connection getConnection() throws SQLException {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://34.71.5.100:5432/postgres";
        String username = "postgres";
        String password = "2044";
        return DriverManager.getConnection(url, username, password);
    }
}
