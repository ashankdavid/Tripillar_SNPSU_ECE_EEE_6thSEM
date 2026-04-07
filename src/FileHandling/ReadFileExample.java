package FileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        try{
            // step 1 Open the File
            File file = new File("student.txt");

            // step 2 Read the File
            Scanner sc = new Scanner(file);

            // step 3 Read the file line by line
            while(sc.hasNextLine()){
                String line = sc.nextLine(); // read lines
                System.out.println(line);
            }

            // step 4 CLoase Scanner
            sc.close();


        }catch (Exception e){
            System.out.println("Error while reading file!");
        }
    }
}
