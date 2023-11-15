package EvenNumber;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input starting number A (0 < A < 500):");
        int startingNumberA = scanner.nextInt();

        System.out.println("Even numbers from " + startingNumberA + " to 500:");

        int currentNumber = startingNumberA;
        while (currentNumber <= 500) {
            if (currentNumber % 2 == 0) {
                System.out.print(currentNumber + " ");
            }
            currentNumber++;
        }
    }
}