import java.util.Scanner;

public class SecondsToTime {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number of seconds
        System.out.println("Input number of seconds: ");
        int seconds = scanner.nextInt();

        // Convert the number of seconds to hours, minutes, and seconds
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        // Format the time as `Hours:Minutes:Seconds`
        String time = String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);

        // Display the result to the user
        System.out.println("Time corresponding to " + seconds + " seconds is " + time + ".");

        // Close the Scanner object
        scanner.close();
    }
}
