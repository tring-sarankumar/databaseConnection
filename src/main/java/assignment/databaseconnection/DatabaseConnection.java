package assignment.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

public class DatabaseConnection {
    String url;
    String username;
    String password;
    Connection con;
    Logger log =  Logger.getLogger("DatabaseConnection");

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
            log.info("Connection Established successfully");
        } catch (Exception e) {
            log.info("Exception "+e);
        }

    }
    void closeCon() {
        try {
            con.close();
            log.info("Connection Closed....");
        } catch (Exception e) {
        	log.info("Exception "+e);

        }

    }

}