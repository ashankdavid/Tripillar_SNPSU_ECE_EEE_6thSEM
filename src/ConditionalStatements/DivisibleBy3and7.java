package ConditionalStatements;

import java.util.Scanner;

public class DivisibleBy3and7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a Number! ");
        int n = sc.nextInt();
        if(n%3==0 && n%7==0){
            System.out.println("Num is Divisinble by both 3 and 7");
        }
        else{
            System.out.println("Get Lost!");
        }
    }
}
