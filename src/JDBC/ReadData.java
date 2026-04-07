package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "admin1234"
            );

            // SQL Query
            String query = "SELECT * FROM students";

            // SQL Statement
            Statement stmt = con.createStatement();

            // ResultSet (Hold the Data)
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getInt("id")
                        + " " + rs.getString("name")
                        + " " + rs.getInt("age"));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}