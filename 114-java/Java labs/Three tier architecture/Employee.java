package Part4;

import java.sql.*;

/**
 * Three tier architecture to query and sql database
 * 
 * @author Nathan Mackenzie & Josh Berryman
 * @version 1.0
 * @since 1.0
 */
public class Employee {

    private ResultSet rs;
    private PreparedStatement pstmt;
    private final Connection conn;
    private final int empID;
    private String firstName;
    private String lastName;
    private String phoneNum;

    /**
     * Constructor to set default values for variables
     * 
     * @param con Connection, The active connection being passed
     * @param ID int, employee id number
     */
    public Employee(Connection con, int ID) {
        
        conn = con;
        empID = ID;
        firstName = "";
        lastName = "";
        phoneNum = "";
        query(empID);
        toString();
    }

    /**
     * Query the employees table in the hr database
     * 
     * @param empID int, Employee id to be used for the query
     */
    public final void query(int empID) {
        
        try {
            String employee = "SELECT first_name, last_name, phone_number FROM employees"
                    + " WHERE employee_id = ?";

            pstmt = conn.prepareStatement(employee);
            pstmt.setInt(1, empID);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                firstName = rs.getString("first_name");
                lastName = rs.getString("last_name");
                phoneNum = rs.getString("phone_number");
            }

        } catch (SQLException ex) {
            System.out.println("Could not complete the query");
        }

    }

    @Override
    public final String toString() {
        return (getFirstName() + "\t" + getLastName() + "\t" + getPhoneNum());
    }

    /**
     * Gets the employee id 
     * 
     * @return The employee id
     */
    public int getEmpID() {
        return empID;
    }

    /**
     * Gets the employee first name 
     * 
     * @return The employee first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the employee last name
     * 
     * @return The employee last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the employee phone number
     * 
     * @return The employee phone number
     */
    public String getPhoneNum() {
        return phoneNum;
    }

}
