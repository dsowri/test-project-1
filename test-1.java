import java.sql.*;

public class UserAuthentication {
    public boolean authenticateUser(String username, String password) {
        boolean isAuthenticated = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Establishing a connection to the database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "password");

            // Creating a SQL query to authenticate the user
            String sql = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
            
            // Executing the SQL query
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            // Checking if any rows are returned
            if (rs.next()) {
                isAuthenticated = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Closing the database resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isAuthenticated;
    }
}
