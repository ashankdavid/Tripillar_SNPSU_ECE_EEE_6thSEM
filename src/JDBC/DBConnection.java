package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static void main(String[] args) {
        try{
            // step 1 - load the driver
//            Class.forName("com.mysql.cj.jdbc.Driver");

            // step2 create connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "admin1234"
            );

            System.out.println("Connected Successfully!");

            // Step 3 Close Connection
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
