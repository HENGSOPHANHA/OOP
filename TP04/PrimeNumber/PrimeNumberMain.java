package PrimeNumber;

import java.util.Scanner;

public class PrimeNumberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        PrimeNumber primeNumber = new PrimeNumber(num);
        if (primeNumber.isPrime()) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}




