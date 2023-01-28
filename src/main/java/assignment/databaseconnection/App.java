package assignment.databaseconnection;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stoploop = true;
        while (stoploop) {
            // table details
            System.out.print("Enter Database url : ");
            String url = sc.next();
            // MySQL credentials
            System.out.print("Enter Database Name : ");
            String username = sc.next();
            System.out.print("Enter Database Password : ");
            String password = sc.next();

            System.out.println("1.Change Connection 2.Close connection 3.exit:");
            int opt = sc.nextInt();

            if (opt == 1) {
                DatabaseConnection a1 = DatabaseConnection.obj(url, username, password);
                a1.connect();

            } else if (opt == 2) {
                DatabaseConnection a1 = DatabaseConnection.obj(url, username, password);
                a1.closeCon();
            } else if (opt == 3) {
                sc.close();
                stoploop = false;
            } else {
                System.out.println("Choose Correct Option");
            }
        }

    }
}