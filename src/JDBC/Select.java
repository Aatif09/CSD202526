import java.sql.*;

public class Select {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "root";
        String query = "SELECT * FROM csa;";
              try(Connection con = DriverManager.getConnection(url, username, password);) {

            System.out.println("Connection established successfully!!!");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.println();
                System.out.println("===========================");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Salary: " + salary);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
