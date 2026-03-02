package LoopingStatements.PatternPrinting;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        size = sc.nextInt();
        // Upper Part
        for(int i=0; i<size; i++){
            for(int j=0; j<size-i-1; j++){
                System.out.print("   ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Lower Part
        for(int i=size-2; i>=0; i--){
            for(int j=0; j<size-i-1; j++){
                System.out.print("   ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
