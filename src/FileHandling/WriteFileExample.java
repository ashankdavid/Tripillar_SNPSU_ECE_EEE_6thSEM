package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            // step 1 - create writer obj and create a file
            FileWriter writer = new FileWriter("student.txt");

            // step 2 writing the data into file
            writer.write("Hello Students\nWelcome to the Class");

            // closing the writer object to close the resources
            writer.close();

            System.out.println("File Written Successfully!");
        }catch (IOException e){
            System.out.println("Error Occured!");
        }
    }
}
