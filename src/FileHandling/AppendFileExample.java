package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFileExample {
    public static void main(String[] args) {
        try {
            // step 1 - append = true; append mode on
            FileWriter writer = new FileWriter("student.txt", true);

            // step 2 writing the data into file
            writer.write("\nNew Line Added");

            // closing the writer object to close the resources
            writer.close();

            System.out.println("File Appended Successfully!");
        }catch (IOException e){
            System.out.println("Error Occured!");
        }
    }
}
