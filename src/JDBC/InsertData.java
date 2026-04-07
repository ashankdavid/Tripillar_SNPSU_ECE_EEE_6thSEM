package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "admin1234"
            );

            // SQL Query
            String query = "INSERT INTO students(id, name, age) VALUES (102,'Anjali', 25)";

            // SQL Statement
            Statement stmt = con.createStatement();

            // Execute Query (Insert/Update/Delete)
            int rows = stmt.executeUpdate(query);

            System.out.println(rows + " row Inserted!");

            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
