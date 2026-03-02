package Basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        float i = sc.nextFloat();
        System.out.printf("You Entered %f", i);
    }
}
