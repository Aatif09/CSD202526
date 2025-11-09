import java.sql.*;

public class Insert {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "root";
        String query = "INSERT INTO csa (id,name, salary) VALUES (?, ?,?)";
        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            System.out.println("Connection established successfully!!!");
            pstmt.setInt(0, 4);
            pstmt.setString(2, "TaJ");
            pstmt.setDouble(3, 95000.00);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Record inserted successfully!");
            }
            System.out.println("Connection closed successfully!!!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
