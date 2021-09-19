package util;

import Model.Appointment;
import Model.Customer;

import java.sql.*;

public class CustomersCRUD {
    public static void loadAllCustomers() throws SQLException {
        Connection conn = Database.getConnection();
        PreparedStatement ps;
        ResultSet rs;

        try {
            Customer tempCustomer;
            String query = "SELECT * FROM customers";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while(rs.next()) {
                // Get data from database
                int customerID = rs.getInt("Customer_ID");
                String customerName = rs.getString("Customer_Name");
                String address = rs.getString("Address");
                String postalCode = rs.getString("Postal_Code");
                String phone = rs.getString("Phone");
                Timestamp createDate = rs.getTimestamp("Create_Date");
                String createdBy = rs.getString("Created_By");
                Timestamp lastUpdate = rs.getTimestamp("Last_Update");
                String lastUpdatedBy = rs.getString("Last_Updated_By");
                int divisionID = rs.getInt("Division_ID");

                // Sets data to object
                tempCustomer = new Customer(customerID, customerName, address, phone,
                        postalCode, divisionID, createDate, lastUpdatedBy,
                        lastUpdate, createdBy);

                // Adds to appointment list
                Customer.addCustomer(tempCustomer);
            }
        }catch(SQLException e) {
            throw new Error("Problem", e);
        }
    }

    public static void insertCustomer(Customer customer) {

    }

    public static void deleteCustomer(Customer customer) {
        PreparedStatement ps;
        try {
            Connection conn = Database.getConnection();
            String query = "DELETE FROM customers WHERE Customer_ID = ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, customer.getCustomerID());
            ps.executeUpdate();
        }catch(SQLException e) {
            throw new Error("Problem", e);
        }
    }
}
