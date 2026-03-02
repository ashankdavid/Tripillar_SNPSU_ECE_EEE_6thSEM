package ConditionalStatements;

import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        int sub1, sub2, sub3, sub4, sub5, totalMarks;
        double percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sub1 Marks: ");
        sub1 = sc.nextInt();
        System.out.println("Enter the Sub2 Marks: ");
        sub2 = sc.nextInt();
        System.out.println("Enter the Sub3 Marks: ");
        sub3 = sc.nextInt();
        System.out.println("Enter the Sub4 Marks: ");
        sub4 = sc.nextInt();
        System.out.println("Enter the Sub5 Marks: ");
        sub5 = sc.nextInt();

        totalMarks = sub1+sub2+sub3+sub4+sub5;
        percentage = (totalMarks/500.0)*100;

        if(percentage >= 75){
            System.out.println('A');
        }else if (percentage >= 50){
            System.out.println('B');
        }else if (percentage >= 30){
            System.out.println('C');
        }else{
            System.out.println("FAIL!");
        }
    }
}
