package LuckyNumber;

import java.util.Scanner;

public class LuckyNumberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input 6 digits number: ");
        int num = scanner.nextInt();

        LuckyNumber luckyNumber = new LuckyNumber(num);
        if (!luckyNumber.isValid()) {
            System.out.println("Invalid input number, please input only 6 digits number.");
            return;
        }

        if (luckyNumber.isLucky()) {
            System.out.println(num + " is a lucky number.");
        } else {
            System.out.println(num + " is not a lucky number.");
        }
    }
}


