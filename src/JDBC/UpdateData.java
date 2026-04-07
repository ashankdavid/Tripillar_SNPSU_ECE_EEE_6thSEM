package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "admin1234"
            );

            // SQL Query
            String query = "UPDATE students SET age=25 WHERE id=101";

            // SQL Statement
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}