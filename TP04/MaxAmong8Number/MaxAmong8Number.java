package MaxAmong8Number;

import java.util.Scanner;

public class MaxAmong8Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];

        System.out.println("Enter eight integers:");
        for (int i = 0; i < 8; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < 8; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The maximum number is: " + max);
    }
}

