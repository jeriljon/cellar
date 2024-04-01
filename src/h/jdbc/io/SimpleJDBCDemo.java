package h.jdbc.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleJDBCDemo {
    public static void main(String[] args) {
        // Database connection string
        String url = "jdbc:sqlite:sample.db"; // This will create 'sample.db' in the project folder if it doesn't exist.

        // SQL statements for creating a new table and inserting data
        String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                "id INTEGER PRIMARY KEY," +
                "name TEXT NOT NULL," +
                "grade INTEGER NOT NULL);";

        String insertSQL = "INSERT INTO students(name, grade) VALUES(?, ?)";
        String selectSQL = "SELECT id, name, grade FROM students";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            // Create a new table
            stmt.execute(createTableSQL);
            System.out.println("Table created or already exists.");

            // Insert data
            try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                pstmt.setString(1, "Alice");
                pstmt.setInt(2, 85);
                pstmt.executeUpdate();

                pstmt.setString(1, "Bob");
                pstmt.setInt(2, 90);
                pstmt.executeUpdate();
                System.out.println("Data inserted.");
            }

            // Query and display data
            try (ResultSet rs = stmt.executeQuery(selectSQL)) {
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + "\t" +
                            rs.getString("name") + "\t" +
                            rs.getInt("grade"));
                }
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

