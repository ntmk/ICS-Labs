/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbctest;

/**
 *
 * @author Nathan
 */
import java.sql.*;

public class JDBCTest {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver"); // load the JDBC driver
        } catch (ClassNotFoundException e) {
            System.out.println("I need to add the ojdbc7.jar file to the project.");
            System.exit(0);
        }
        // create a Connection to the database
        try {
            conn = DriverManager.getConnection(
                    "jdbc oracle database goes here",
                    "username", // substitute your username and password in these Strings
                    "password");
            Statement stmt = conn.createStatement();
            PreparedStatement pstmt;
        
                
                 System.out.println(s.toString() + ", " + s.getKey());
            
                String addEmployee = "select * from employees" + 
                " where employee_id" + "(?)";
            
            try {
            
                pstmt = conn.prepareStatement(addEmployee);
                pstmt.setString(1, s.toString());
                pstmt.executeUpdate();
            
            }
            
            catch (SQLException e) {
            
                System.out.println("Could not create insert statement");
            
            }
        
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            // release the resource in a finally block to ensure you never keep Connections open
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException se) {
                }
            }
        }
    }
}
