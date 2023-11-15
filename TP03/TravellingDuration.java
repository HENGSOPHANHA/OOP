import java.util.Scanner;

public class TravellingDuration {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the traffic jam factor (in percentage [0-100])
        System.out.println("Please input traffic jam factor (in percentage [0-100]): ");
        int trafficJamFactor = getUserInput(scanner);

        // Calculate the adjusted speed based on the traffic jam factor
        double averageSpeed = 30; // km/h
        double adjustedSpeed = averageSpeed - (averageSpeed * trafficJamFactor / 100);

        // Calculate the travel duration in hours, minutes, and seconds
        double distance = 7; // km
        double travelDurationInHours = distance / adjustedSpeed;
        int travelDurationInSeconds = (int) (travelDurationInHours * 3600);

        // Format the travel duration as HH:mm:ss
        int hours = travelDurationInSeconds / 3600;
        int minutes = (travelDurationInSeconds % 3600) / 60;
        int seconds = travelDurationInSeconds % 60;

        // Display the results to the user
        System.out.println("Travelling Duration = " + String.format("%02d:%02d:%02d", hours, minutes, seconds));

        // Close the Scanner object
        scanner.close();
    }

    private static int getUserInput(Scanner scanner) {
        // Ensure that the user enters a valid integer within the specified range
        while (true) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input >= 0 && input <= 100) {
                    return input;
                }
            }
            System.out.println("Please enter a valid percentage between 0 and 100.");
            scanner.next(); // Consume the invalid input
        }
    }
}
