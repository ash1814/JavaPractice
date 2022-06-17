package Chapter3;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String arg[]) {

        //Initialize known value
        int requiredSalary = 30000;
        int requiredExperience = 2;
        //Get unknown value
        System.out.println("Whats your monthly salary: ");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();
        System.out.println("Enter your years of experience");
        scanner = new Scanner(System.in);
        double experience = scanner.nextDouble();
        //take Decision

        if (salary >= requiredSalary) {
            if (experience >= requiredExperience) {

                System.out.println("You are qualified for loan");
            } else {
                System.out.println("You need " + requiredExperience + "  years of experiene");
            }
        } else {
            System.out.println("Your salary needs to be at least " + requiredSalary);
        }

    }
}


