package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Date;
import java.sql.Timestamp;

public class Country {
    private int countryID;
    private String country;
    private Timestamp createDate;
    private String createdBy;
    private Timestamp lastUpdate;
    private String lastUpdatedBy;

    private static ObservableList<Country> allCountries = FXCollections.observableArrayList();


    public static void addCountry(Country country) {
        allCountries.add(country);
    }

    // TODO: Sure I can delete at the end
    public static boolean deleteCountry(Country country) {
        return allCountries.remove(country);
    }

    public static ObservableList<Country> getAllCountries() {
        return allCountries;
    }

    /**
     * Gets country ID of a Country object
     * @return Country ID
     */
    public int getCountryID() {
        return countryID;
    }

    /**
     * Sets countryID of a country
     * @param countryID Provided country ID
     */
    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    /**
     * Gets country name
     * @return Name of a country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets country name
     * @param country Given country name
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets creation date of country object
     * @return Date country object was created
     */
    public Timestamp getCreateDate() {
        return createDate;
    }

    /**
     * Sets creation date of country
     * @param createDate Date country object was created
     */
    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    /**
     * Gets the information of who created country object
     * @return User who created country object
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets who created country object
     * @param createdBy Given user who created country object
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Returns last update of country object
     * @return Timestamp of last update
     */
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the last updated time of country object
     * @param lastUpdate time of last update
     */
    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * Gets the user who last updated country object
     * @return Last user to update country object
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets user who last updated country object
     * @param lastUpdatedBy Given user who last updated country object
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String toString() {
        return country;
    }
}
