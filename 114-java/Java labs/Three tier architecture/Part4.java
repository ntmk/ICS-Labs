package Part4;

import java.sql.*;
import java.util.Scanner;

/**
 * Three tier architecture to query and sql database
 *
 * @author Nathan Mackenzie & Josh Berryman
 * @version 1.0
 * @since 1.0
 */
public class Part4 {

    /**
     * Main routine to run the three tier architecture JDBC program
     * 
     * @param args Arguments used throughout main routine to be passed
     */
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String user = scnr.nextLine();
        System.out.print("Enter password: ");
        String pass = scnr.nextLine();
        
        LoginManager auth = new LoginManager(user, pass);
        auth.login(user, pass);
        Connection conn = auth.getConnection();
        String find;
        
        while (true) {
            System.out.print("Search for: ");
            find = scnr.nextLine();
            if (find.equals("exit")) {
                break;
            } else {
                Search empSearch = new Search(conn, find);
                while (empSearch.hasNext()) {
                    Employee emp = new Employee(conn, empSearch.nextInt());
                    System.out.println(emp);
                }
            }
        }
    }
}
