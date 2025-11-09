import java.sql.*;

public class Create {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "root";
        String query = "CREATE TABLE csa (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(50), " +
                "salary DOUBLE)";

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Table 'csa' created successfully!");

        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
