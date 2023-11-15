package ReversingNumber;

import java.util.Scanner;

public class ReversingNumber {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input 4 digits number: ");
        int num = scanner.nextInt();

        if (Integer.toString(num).length() != 4) {
            System.out.println("Error: invalid number, please input only 4 digits number.");
            return;
        }

        int reversedNum = 0;
        for (int i = 0; i < 4; i++, num /= 10) {
            reversedNum = reversedNum * 10 + num % 10;
        }

        System.out.println("After reverse: " + reversedNum);
    }
}


