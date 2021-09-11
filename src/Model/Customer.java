package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Date;
import java.sql.Timestamp;

public class Customer {
    private int customerID;
    private String customerName;
    private String address;
    private String postalCode;
    private String phone;
    private Timestamp createDate;
    private Timestamp lastUpdate;
    private String createdBy;
    private int divisionID;
    private String lastUpdatedBy;

    private static ObservableList<Customer> allCustomers = FXCollections.observableArrayList();

    public Customer() {

    }

    public static ObservableList<Customer> getAllCustomers() {
        return allCustomers;
    }

    public static void addCustomer(Customer customer) {
        allCustomers.add(customer);
    }

    // CONSTRUCTOR WITH REQUIRED FIELDS NEEDED (NAME, ADDRESS, POSTAL CODE, PHONE NUMBER)
    /**
     * Constructor for customers with all the required fields for database entry
     * @param customerID Customer ID (auto-generated by SQL database)
     * @param customerName Name of customer
     * @param address Address of customer
     * @param phone Phone number of customer
     * @param divisionID First-level division ID
     */
    public Customer(int customerID, String customerName, String address, String phone, String postalCode, int divisionID) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
        this.divisionID = divisionID;
        this.postalCode = postalCode;
    }

    /**
     * Constructor to set all possible values for Customer to send to MySQL database
     * @param customerID ID of customer; auto-generated by database
     * @param customerName Name of customer
     * @param address Address of customer
     * @param phone Phone number of customer
     * @param divisionID First-division ID of customer
     * @param createDate Date customer was created
     * @param lastUpdate Date customer information was last updated
     * @param createdBy Which user created this Customer
     */
    public Customer(int customerID, String customerName, String address, String phone,
                    String postalCode, int divisionID, Timestamp createDate, String lastUpdatedBy,
                    Timestamp lastUpdate, String createdBy) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
        this.divisionID = divisionID;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.createdBy = createdBy;
        this.postalCode = postalCode;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * Get customerID (auto-gen from database)
     * @return Customer's ID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Set customerID (useful for CRUD operations)
     * @param customerID Provided customerID
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * Gets customer name
     * @return Customer name of a customer object
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets customer name
     * @param customerName Provided customer name
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Gets customer address
     * @return Address of a customer object
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets customer address
     * @param address Provided customer address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets postal code of a customer
     * @return Postal code of a customer
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets customer postal code
     * @param postalCode Provided postal code
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Gets customer phone
     * @return Customers phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets customer phone number
     * @param phone Provided phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the last update occurrence of a customer object
     * @return The last update occurrence of a customer
     */
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the last updated occurrence of a customer object
     * @param lastUpdate Provided last updated information
     */
    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * Gets the creation date of a customer object
     * @return Date customer was created
     */
    public Timestamp getCreateDate() {
        return createDate;
    }

    /**
     * Sets the date a customer was created
     * @param createDate Provided creation date
     */
    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    /**
     * Gets which user created a specific customer object
     * @return User who created customer
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the user who created customer object
     * @param createdBy Provided user who created customer object
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets the divisionID of a customer
     * @return Gets first-level division id of a customer
     */
    public int getDivisionID() {
        return divisionID;
    }

    /**
     * Sets divisionID for a customer
     * @param divisionID Provided divisionID for a customer
     */
    public void setDivisionID(int divisionID) {
        this.divisionID = divisionID;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
}
