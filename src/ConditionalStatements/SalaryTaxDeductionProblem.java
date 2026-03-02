package ConditionalStatements;

import java.util.Scanner;

public class SalaryTaxDeductionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Salary: ");
        double sal = sc.nextDouble();
        double tax = 0;
        double netSalary;

        if(sal < 300000){
            tax = 0;
        }else{
            if(sal < 700000){
                tax = sal * 0.10; // 10% tax
            }else{
                tax = sal * 0.20; // 20% tax
            }
        }
        netSalary = sal - tax;
        System.out.println("Tax Amount " + tax);
        System.out.println("Net Salary " + netSalary);
    }
}
