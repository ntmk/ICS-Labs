package Lab6;

import java.sql.*;
import java.util.Scanner;

/**
 * JDBC program to create and display key/value pairs for reference
 * 
 * @author Nathan Mackenzie & Josh Berryman
 */
public class LoginManager {

    private final Scanner scnr;
    private Connection conn;

    /**
     * Declaring instance variable
     */
    private Statement stmt;

    /**
     * Constructor to create a new scanner object
     */
    public LoginManager() {

        scnr = new Scanner(System.in);

    }

    /**
     * Prompts user for login and connects to the database
     */
    public void login() {

        System.out.println("Enter user name: ");
        String user = scnr.next();
        System.out.println("Enter password: ");
        String pass = scnr.next();

        conn = null;

        try {

            Class.forName("oracle.jdbc.OracleDriver"); // load the JDBC driver
        } catch (ClassNotFoundException e) {

            System.out.println("I need to add the ojdbc7.jar file to the project.");
            System.exit(0);

        }

        try {

            conn = DriverManager.getConnection(
                    "jdbc oracle db address",
                    user, // substitute your username and password in these Strings
                    pass);
            stmt = conn.createStatement();

        } catch (SQLException e) {

            System.out.println("You didnt connect");

        }

    }

    /**
     * Method to fetch the connection
     * 
     * @return the connection
     */
    public Connection getConnection() {

        return conn;

    }

}
