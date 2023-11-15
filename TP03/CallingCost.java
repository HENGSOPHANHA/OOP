import java.util.Scanner;

public class CallingCost{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time start (hours ): ");
        int startHour = input.nextInt();
        System.out.println("Enter the time start ( minutes): ");
        int startMinute = input.nextInt();
        System.out.println("Enter the time start (seconds): ");
        int startSecond = input.nextInt();

        //Calculate the Total number of minutes called
        System.out.println("Enter the time end (hours): ");
        int endHour = input.nextInt();
        System.out.println("Enter the time end (minutes): ");
        int endMinute = input.nextInt();
        System.out.println("Enter the time end (seconds): ");
        int endSecond = input.nextInt();

        // Calculate the Total cost of the call
        int totalSecondsStart = startHour * 3600 + startMinute * 60 + startSecond;
        int totalSecondsEnd = endHour * 3600 + endMinute * 60 + endSecond;

        double totalSecondsCalled = (double)(totalSecondsEnd - totalSecondsStart);
        Double totalMinutesCalled = (double)totalSecondsCalled / 60;
        double remainingSeconds = (double) totalSecondsCalled % 60;
        double totalCost = (double)totalMinutesCalled * 0.05;

        System.out.println("Total number of minutes called: " + totalMinutesCalled + " minutes and " + remainingSeconds + " seconds");
        System.out.printf("Total cost of the call: %.4f $" ,totalCost);

        input.close();
    }
}