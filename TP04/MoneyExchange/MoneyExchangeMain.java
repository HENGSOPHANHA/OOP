package MoneyExchange;

import java.util.Scanner;

public class MoneyExchangeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to program Money Exchanges!");
        System.out.println("1. Riels to Dollar");
        System.out.println("2. Riels to Thai Baht");
        System.out.println("3. Dollar to Riels");
        System.out.println("4. Dollar to Thai Baht");
        System.out.println("5. Thai Baht to Riels");
        System.out.println("6. Exit");

        while (true) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Exiting the program.");
                break;
            }

            double amount;
            double result;

            if (choice == 1) {
                System.out.print("Input money in RIELS: ");
                amount = scanner.nextDouble();
                Riels riels = new Riels(amount);
                result = riels.toDollar();
                System.out.printf("%.2f RIELS = %.2f USD\n", amount, result);
            } else if (choice == 2) {
                System.out.print("Input money in RIELS: ");
                amount = scanner.nextDouble();
                Riels riels = new Riels(amount);
                result = riels.toThaiBaht();
                System.out.printf("%.2f RIELS = %.2f Thai Baht\n", amount, result);
            } else if (choice == 3) {
                System.out.print("Input money in Dollars: ");
                amount = scanner.nextDouble();
                Dollars dollars = new Dollars(amount);
                result = dollars.toRiels();
                System.out.printf("%.2f USD = %.2f RIELS\n", amount, result);
            } else if (choice == 4) {
                System.out.print("Input money in Dollars: ");
                amount = scanner.nextDouble();
                Dollars dollars = new Dollars(amount);
                result = dollars.toThaiBaht();
                System.out.printf("%.2f USD = %.2f Thai Baht\n", amount, result);
            } else if (choice == 5) {
                System.out.print("Input money in Thai Baht: ");
                amount = scanner.nextDouble();
                ThaiBaht thaiBaht = new ThaiBaht(amount);
                result = thaiBaht.toRiels();
                System.out.printf("%.2f Thai Baht = %.2f RIELS\n", amount, result);
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    }

