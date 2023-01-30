package assignment.databaseconnection;
import java.util.Scanner;
import java.util.logging.Logger;
public class DatabaseConnectionMain {
    public static void main(String[] args) {
    	Logger log =  Logger.getLogger("InfoLogging");
        Scanner sc = new Scanner(System.in);
        boolean stoploop = true;
        
        // table details
        log.info("Enter Database url : ");
        String url = sc.next();
        
        // MySQL credentials
        log.info("Enter UserName : ");
        String username = sc.next();
        log.info("Enter Password : ");
        String password = sc.next();
        DatabaseConnection a1 = DatabaseConnection.obj(url, username, password);
        while (stoploop) {

            log.info("1.Change Connection 2.Close connection 3.exit:");
            int opt = sc.nextInt();

            if (opt == 1) {
                
                a1.connect();

            } else if (opt == 2) {

                a1.closeCon();
            } else if (opt == 3) {
                sc.close();
                stoploop = false;
            } else {
                log.info("Choose Correct Option");
            }
        }

    }
}