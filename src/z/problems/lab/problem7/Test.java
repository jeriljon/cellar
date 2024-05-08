package z.problems.lab.problem7;

import java.sql.*;

import static java.sql.ResultSet.TYPE_SCROLL_SENSITIVE;

public class Test {

    public static void main(String[] args) {

    }

    public static void setDbConnection() throws SQLException {
        String connectionString = "jdbc:mysql://localhost:3306/mydb";
        try (Connection con = DriverManager.getConnection(connectionString)) {
            Statement statement = con.createStatement();
            String qry = "UPDATE course SET course_fee = ? WHERE course_level = ?";
            PreparedStatement prStmt = con.prepareStatement(qry, TYPE_SCROLL_SENSITIVE);
            prStmt.setDouble(1, 600.00);
            prStmt.setInt(2, 2);
            System.out.println(prStmt.executeUpdate());

        } catch (SQLException sqlException) {
            System.out.println(sqlException);
        }

    }
}
