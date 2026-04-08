package JDBC;

import java.sql.*;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_app",
                    "root",
                    "admin1234"
            );

            while(true){
                System.out.println("Select any Operations:" +
                        "\n1.Insert\n2.View\n3.Update\n4.Delete\n5.Exit");
                int choice = sc.nextInt();
                if(choice == 1){
                    System.out.println("Enter the ID: ");
                    int id = sc.nextInt();

                    System.out.println("Enter the Name: ");
                    String name = sc.next();

                    System.out.println("Enter the Age: ");
                    int age = sc.nextInt();

                    String query = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setInt(3, age);
                    ps.executeUpdate();
                    System.out.println("Data Inserted Successfully!");
                }else if (choice == 2){
                    String query = "SELECT * FROM students";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);
                    while(rs.next()){
                        System.out.println(rs.getInt("id")
                                + " " + rs.getString("name") + " "
                                + rs.getInt("age"));
                    }
                }else if(choice == 3){
                    System.out.println("Enter the ID to update: ");
                    int id = sc.nextInt();

                    System.out.println("Enter New Name: ");
                    String name = sc.next();

                    System.out.println("Enter New Age: ");
                    int age = sc.nextInt();

                    String query = "UPDATE students SET name=?, age=? WHERE id =?";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, name);
                    ps.setInt(2, age);
                    ps.setInt(3, id);
                    int rows = ps.executeUpdate();
                    if(rows > 0){
                        System.out.println("Data Updated!");
                    }else{
                        System.out.println("ID not found!");
                    }
                }else if(choice == 4){
                    System.out.println("Enter the ID to delete: ");
                    int id = sc.nextInt();

                    String query = "DELETE FROM students WHERE id=?";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setInt(1, id);
                    int rows = ps.executeUpdate();
                    if(rows>0){
                        System.out.println("Data Deleted!");
                    }else{
                        System.out.println("ID not found!");
                    }
                }else{
                    break;
                }
            }

            con.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
