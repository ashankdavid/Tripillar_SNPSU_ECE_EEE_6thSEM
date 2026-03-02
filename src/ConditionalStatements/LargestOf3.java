package ConditionalStatements;

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1");
        num1 = sc.nextInt();
        System.out.println("Enter Num2");
        num2 = sc.nextInt();
        System.out.println("Enter Num3");
        num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("Num1 is Greater!");
        }else if(num2 > num3){
            System.out.println("Num2 is Greater!");
        }else{
            System.out.println("Num3 is Greater!");
        }
    }
}
