
import java.util.Scanner;

public class Rectagle {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the width and height of the rectangle
        System.out.println("Please input width (in meter): ");
        double width = scanner.nextDouble();

        System.out.println("Please input height (in meter): ");
        double height = scanner.nextDouble();

        // Calculate the perimeter and surface of the rectangle
        double perimeter = 2 * (width + height);
        double surface = width * height;

        // Display the results to the user
        System.out.println("Perimeter = " + perimeter + " m");
        System.out.println("Surface = " + surface + " m^2");

        // Close the Scanner object
        scanner.close();
    }
}


