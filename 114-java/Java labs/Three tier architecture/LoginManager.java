package Part4;

import java.sql.*;

/**
 * Three tier architecture to query and sql database
 *
 * @author Nathan Mackenzie & Josh Berryman
 * @version 1.0
 * @since 1.0
 */
public class LoginManager {

    private Connection conn;
    private Statement stmt;
    private final String user;
    private final String pass;

    /**
     * Constructor to set default values for variables
     *
     * @param usr String, User name
     * @param pw String, user password
     */
    public LoginManager(String usr, String pw) {

        user = usr;
        pass = pw;

    }

    /**
     * Prompts user for login and connects to the database
     *
     * @param user String username
     * @param pass String Password
     */
    public void login(String user, String pass) {

        conn = null;

        try {

            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {

            System.out.println("I need to add the ojdbc7.jar file to the project.");
            System.exit(0);

        }

        try {

            conn = DriverManager.getConnection(
                    "jdbc oracle db address",
                    user,
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
