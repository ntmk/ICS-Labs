package Part4;

import java.sql.*;
import java.util.ArrayList;

/**
 * Three tier architecture to query and sql database
 *
 * @author Nathan Mackenzie & Josh Berryman
 * @version 1.0
 * @since 1.0
 */
public class Search {

    private final ArrayList<Integer> results;
    private final Connection conn;
    private final String input;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private int index;

    /**
     * Constructor to set default values for variables
     * 
     * @param con Connection, The active connection being passed
     * @param inpt String, User input for query
     */
    public Search(Connection con, String inpt) {
        index = 0;
        conn = con;
        results = new ArrayList<>();
        input = inpt;
        query(conn, input);
    }

    /**
     * Query the employee_index that is written by the program for quick reference
     * 
     * @param conn Connection, The active connection being passed
     * @param input String, User input for query
     */
    public final void query(Connection conn, String input) {

        try {
            pstmt = conn.prepareStatement("SELECT * FROM EMPLOYEES_INDEX"
                    + " WHERE UPPER(employee_name) LIKE ?");
            pstmt.setString(1, input.toUpperCase() + '%');
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("employee_id");
                results.add(id);

            }
        } catch (SQLException e) {

            System.out.println("Could not query the table.");

        }

    }

    /**
     * Checks if there is a next index 
     * 
     * @return True or false
     */
    public boolean hasNext() {
        return index < results.size();
    }

    /**
     * Used to get the next index / employee number 
     * 
     * @return Next index / employee number
     */
    public int nextInt() {
        int temp = results.get(index);
        index = index + 1;
        System.out.println(index);
        return temp;
    }

}
