package Chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String arg[]) {
        //known value
        int quota = 10;
        //number of sales
        System.out.println("Enter Number of sales made in a week ;");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        //if statement
        if (sales >= quota) {
            System.out.println("Congratulatins! you have fullfiiled quota");
        } else {
            int salesShort = quota - sales;
            System.out.println("You are sales short of " + salesShort);

        }

    }
}

