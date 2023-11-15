package PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number to list prime numbers from 2 to it:");
        int inputNumber = scanner.nextInt();

        System.out.println("Prime numbers from 2 to " + inputNumber + ":");

        int currentNumber = 2;
        while (currentNumber <= inputNumber) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= Math.sqrt(currentNumber); divisor++) {
                if (currentNumber % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(currentNumber + " ");
            }

            currentNumber++;
        }
    }
}
