package Chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary= 25000;
    static int requiredCreditScore = 700;

    public static void main(String[] args) {
        //inititalize what we know


        //inititalize what we dont know
        getFormData();

        //Check if the user is qualified
        isUserQualified()
        //Notify the user
    }

    public static void getFormData() {
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter your Credit Score:");
        int creditScore = scanner.nextInt();
        scanner.close();


    }

    public static boolean isUserQualified() {
        if(creditScore >= requiredCreditScore && salary>= requiredSalary){

        }
    }


}
