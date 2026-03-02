package LoopingStatements.PatternPrinting;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        size = sc.nextInt();

        // upper part
        for(int i=1; i<=size; i++){
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int k=2*i; k<=2*size; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part
        for(int i=size; i>0; i--){
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int k=2*i; k<=2*size; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
