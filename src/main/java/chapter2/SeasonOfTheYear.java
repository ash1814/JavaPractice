package chapter2;

import java.util.Scanner;

public class SeasonOfTheYear {

    public static void main(String arg[]){
//       1. Enter a season of the year
    System.out.println("Enter the season of the Year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

//       2. Enter a whole number
        System.out.println("Enter a whole number");
        int year = scanner.nextInt();
//       3. Enter an adective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day," + "I drink a minimum of " + year + " cups of coffee" );



    }

}
