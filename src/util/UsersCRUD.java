package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersCRUD {
    public static int getUserID(String username) throws SQLException {
        Connection conn = Database.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        int userID = 0;

        try {
            String query = "SELECT User_ID FROM users WHERE User_Name = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while(rs.next()) {
                userID = rs.getInt("User_ID");
            }
        }catch(SQLException e) {
            throw new Error("Problem", e);
        }
        return userID;
    }

    public static String getUserName(int userID) throws SQLException {
        Connection conn = Database.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        String username = "";

        try {
            String query = "SELECT User_Name FROM users WHERE User_ID = ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, userID);
            rs = ps.executeQuery();
            while(rs.next()) {
                username = rs.getString("User_Name");
            }
        }catch(SQLException e) {
            throw new Error("Problem", e);
        }
        return username;
    }

}
