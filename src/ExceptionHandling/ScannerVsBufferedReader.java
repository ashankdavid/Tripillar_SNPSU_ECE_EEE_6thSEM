package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerVsBufferedReader {
    public static void main(String[] args) throws IOException {
        String name;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter some name!: ");
        name = br.readLine();
        System.out.println("You entered: " + name);

    }
}
