import java.util.Scanner;

public class SummationWithoutLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the start, end, and increment numbers
        System.out.println("Input the start number: ");
        int start = scanner.nextInt();

        System.out.println("Input the end number: ");
        int end = scanner.nextInt();

        System.out.println("Input the increment: ");
        int increment = scanner.nextInt();

        // Calculate the summation
        int summation = calculateSummation(start, end, increment);

        // Display the result to the user
        System.out.println("The summation is: " + summation);

        // Close the Scanner object
        scanner.close();
    }

    private static int calculateSummation(int start, int end, int increment) {
        // If the start number is greater than the end number, return 0
        if (start > end) {
            return 0;
        }

        // Calculate the number of terms in the summation
        int numberOfTerms = (end - start) / increment + 1;

        // Calculate the summation using the arithmetic series formula
        int summation = ( numberOfTerms * (2 * start + (numberOfTerms - 1) * increment )) / 2;

        return summation;
    }
}

