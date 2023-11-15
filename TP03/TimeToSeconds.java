    import java.util.Scanner;

public class TimeToSeconds {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the hours, minutes, and seconds
        System.out.println("Please input hours: ");
        int hours = scanner.nextInt();

        System.out.println("Please input minutes: ");
        int minutes = scanner.nextInt();

        System.out.println("Please input seconds: ");
        int seconds = scanner.nextInt();

        // Calculate the number of seconds
        int numberOfSeconds = hours * 3600 + minutes * 60 + seconds;

        // Display the result to the user
        System.out.println("Number of seconds = " + numberOfSeconds);

        // Close the Scanner object
        scanner.close();
    }
}

