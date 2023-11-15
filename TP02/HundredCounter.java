import java.util.Scanner;

public class HundredCounter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive number
        System.out.println("Please input a positive number: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        // Count the number of hundreds in the number
        int hundreds = number / 100;

        // Display the result to the user
        System.out.println("There are " + hundreds + " hundreds in number " + number + ".");

        // Close the Scanner object
        scanner.close();
    }
}

