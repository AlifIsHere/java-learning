import java.sql.*;

public class OracleConnectionExample {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connect to the database
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String user = "sys as sysdba";
            String password = "P@ssw0rd";

            conn = DriverManager.getConnection(url, user, password);

            // Perform database operations
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM LOCAL_USER");

            String userName = "user8";

            while (rs.next()) {
                System.out.println(rs.getString("USERNAME"));
                if (rs.getString("USERNAME").equals(userName)) {
                    break;
                }
            }

            // Close the connection
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}