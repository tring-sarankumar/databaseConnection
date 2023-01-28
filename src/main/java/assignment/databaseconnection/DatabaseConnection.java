package assignment.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    String url;
    String username;
    String password;
    Connection con;

    private DatabaseConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DatabaseConnection obj(String url, String username, String password) {

        return new DatabaseConnection(url, username, password);

    }

    void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            System.err.println("Connection Established successfully");
        } catch (Exception e) {
            System.err.println(e);
        }

    }
    void closeCon() {
        try {
            con.close();
            System.out.println("Connection Closed....");
        } catch (Exception e) {
            System.err.println(e);

        }

    }

}