
import java.util.Scanner;

public class visal {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Enter your name: ");

        // Read the user's name from the keyboard
        String name = scanner.nextLine();

        // Display a greeting to the user
        System.out.println("Hello " + name + "!");

        // Close the Scanner object
        scanner.close();
    }
}

      
  

