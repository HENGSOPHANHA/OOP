import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the values of y and z
        System.out.println("Please input y: ");
        double y = scanner.nextDouble();

        System.out.println("Please input z: ");
        double z = scanner.nextDouble();

        // Calculate the value of x
        double x = 1 / (1 / y + 1 / z);

        // Display the result to the user
        System.out.println("x = " + x);

        // Close the Scanner object
        scanner.close();
    }
}
