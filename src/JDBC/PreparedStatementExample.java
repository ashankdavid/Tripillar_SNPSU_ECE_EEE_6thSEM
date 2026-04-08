package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementExample {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "admin1234"
            );

            // SQL Query
            String query = "INSERT INTO students (id, name, age) VALUES (?, ?, ?) ";

            // step 3 (creating prepared statements)
            PreparedStatement ps = con.prepareStatement(query);

            // step 4 (setting up values)
            ps.setInt(1, 101);
            ps.setString(2, "Anjali");
            ps.setInt(3, 95);

            System.out.println("Data Inserted Successfully!");

            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
