package Lab6;

import java.sql.*;

/**
 * JDBC program to create and display key/value pairs for  reference
 * 
 * @author Nathan Mackenzie & Josh Berryman
 */
public class JDBCOutput extends IndexOutput {
    
    private final Connection conn;
    private PreparedStatement pstmt;
    private Statement stmt;
    
    /**
     * Constructor to set default values to instance variables
     * 
     * @param con the connection object being passed
     * @param sort object passed from indexoutput class
     */
    public JDBCOutput(Connection con, Sorter sort) {
        
        super(sort);
        conn = con;
        createTable();
    
    }
    
    /**
     * Drops old table to prevent replication of data, then creates a new one.
     * 
     * @throws SQLException if table not not found
     */
    private void createTable() {

        try {

            stmt = conn.createStatement();
            pstmt = conn.prepareStatement("DROP TABLE employees_index");
            pstmt.executeUpdate();
        } 
        
        catch (SQLException ex) {

            System.out.println("Table was not found. Creating a new one");

        }
            
        try {
              
            pstmt = conn.prepareStatement("CREATE TABLE employees_index( " + "employee_name VARCHAR(50), "
                + "employee_id NUMBER(6) NOT NULL)");
                pstmt.executeUpdate();
        
        }
        
        catch (SQLException e) {
        
            System.out.println("Couldn't create table");
            
        } 
    
    }
    
    /**
     * Method for printing out the table
     * 
     */
    @Override
    public void print() {
    
        while (sort.hasMoreLines()) {
        
            Line s = sort.nextLine();
            System.out.println(s.toString() + ", " + s.getKey());
            
            String addEmployee = "INSERT INTO employees_index" + 
                " (EMPLOYEE_NAME, EMPLOYEE_ID) VALUES" + "(?, ?)";
            
            try {
            
                pstmt = conn.prepareStatement(addEmployee);
                pstmt.setString(1, s.toString());
                pstmt.setInt(2, s.getKey());
                pstmt.executeUpdate();
            
            }
            
            catch (SQLException e) {
            
                System.out.println("Could not create insert statement");
            
            }
        
        }
        
        try {
            
            stmt.close();
            pstmt.close();
            conn.close();
        
        }
        
        catch (SQLException ex) {
        
            System.out.println("Failed to close connections");
        
        }
        
}

}