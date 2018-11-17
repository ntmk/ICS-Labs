package Lab6;

import java.sql.*;
import java.util.ArrayList;

/**
 * JDBC program to create and display key/value pairs for reference
 * 
 * @author Nathan Mackenzie & Josh Berryman
 */
public class JDBCInput implements LineIterator {
   
    private final Connection conn;
    private ResultSet rs;
    private Statement stmt;
    private final ArrayList<Line> words;
    private int index;

    /**
     * Constructor setting defaults for instance variables
     * 
     * @param con is the connection to the database
     */
    public JDBCInput(Connection con) {
        
        conn = con;
        words = new ArrayList<>();
        this.index = 0;
        query();
        
    }
    
    /**
     * Runs a query on database to add them to an array list
     */
    private void query() {
                
        try {
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT LAST_NAME, FIRST_NAME, EMPLOYEE_ID"
                    + " FROM EMPLOYEES");
            while (rs.next()) {
                String name = rs.getString("last_name");
                name += (" ");
                name += rs.getString("first_name");
                int id = rs.getInt("employee_id");
                Line line = new Line(name, id);
                words.add(line);
                
            }
           
        } 
        catch (SQLException e) {
            
            System.out.println("Query failed");
        
        }
    
    }

    @Override
    public boolean hasMoreLines() {
         
        return index < words.size();
        
    }

    @Override
    public Line nextLine() {
        
        Line temp = words.get(index);
        index = index + 1;
        return temp;

    }

}
