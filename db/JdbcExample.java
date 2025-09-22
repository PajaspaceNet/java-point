import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";

        Connection conn = DriverManager.getConnection(url, user, pass);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT id, name FROM users");

        while (rs.next()) {
            System.out.println(rs.getInt("id") + ": " + rs.getString("name"));
        }

        rs.close();
        stmt.close();
        conn.close();
    }
}
