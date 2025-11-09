import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {
       String url = "jdbc:mysql://localhost:3306/Students";
       String username = "root";
       String password = "root";
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }
}


//
//
//public class Main {
//    public static void main(String[] args) {
//
//        String url = "jdbc:mysql://localhost:3306/Students";
//        String username = "root";
//        String password = "root";
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            try (Connection connection = DriverManager.getConnection(url, username, password)) {
//                System.out.println("Connected to the database.");
//            }
//
//        } catch (ClassNotFoundException e) {
//            System.err.println("MySQL JDBC Driver not found: " + e.getMessage());
//        } catch (SQLException e) {
//            System.err.println("Connection failed: " + e.getMessage());
//        }
//    }
//}