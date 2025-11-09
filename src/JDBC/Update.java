import java.sql.*;

public class Update {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "root";
        String query = "UPDATE csa SET name = ?, salary = ? WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            System.out.println("Connection established successfully!!!");

            pstmt.setString(1, "AaJ");
            pstmt.setDouble(2, 90000.00);
            pstmt.setInt(3, 2);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Record updated successfully!");
            } else {
                System.out.println("No record found with the given ID.");
            }

            System.out.println("Connection closed successfully!!!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
