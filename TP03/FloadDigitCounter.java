import java.util.Scanner;

public class FloadDigitCounter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a floating-point number
        System.out.println("Please input a floating-point number: ");
        float number = scanner.nextFloat();

        // Split the floating-point number into its integral and fractional parts
        int integralPart = (int) number;
        float fractionalPart = number - integralPart;

        // Count the number of digits in the integral part
        int integralDigitCount = 0;
        while (integralPart > 0) {
            integralPart /= 10;
            integralDigitCount++;
        }

        // Count the number of digits in the fractional part
        int fractionalDigitCount = 0;
        while (fractionalPart > 0.0) {
            fractionalPart *= 1;
            int fractionalDigit = (int) fractionalPart;
            if (fractionalDigit > 0) {
                fractionalDigitCount++;
            }
            fractionalPart -= fractionalDigit;
        }

        // Display the results to the user
        System.out.println("Number of digits in the integral part: " + integralDigitCount);
        System.out.println("Number of digits in the fractional part: " + fractionalDigitCount);

        // Close the Scanner object
        scanner.close();
    }
}
