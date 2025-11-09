import java.sql.*;

public class Delete {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "root";
        String query = "DELETE FROM csa WHERE id = ?";
        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = con.prepareStatement(query)) {
            System.out.println("Connection established successfully!!!");
            pstmt.setInt(1, 2);  // deletes the record where id = 2
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Record deleted successfully!");
            } else {
                System.out.println("No record found with the given ID.");
            }

            System.out.println("Connection closed successfully!!!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
