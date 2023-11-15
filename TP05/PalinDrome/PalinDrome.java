package PalinDrome;

import java.util.Scanner;

public class PalinDrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give a word to check:");
        String word = scanner.nextLine();

        // Ask the user to choose the checking method
        System.out.println("Choose method (REV, LOOP):");
        String methodChoice = scanner.nextLine().toUpperCase();

        boolean isPalindrome = false;

        if (methodChoice.equals("REV")) {
            isPalindrome = isPalindromeReversed(word);
        } else if (methodChoice.equals("LOOP")) {
            isPalindrome = isPalindromeLoop(word);
        } else {
            System.out.println("Invalid method choice. Please choose 'REV' or 'LOOP'.");
        }

        if (isPalindrome) {
            System.out.printf("%s is a Palindrome.\n", word);
        } else {
            System.out.printf("%s is not a Palindrome.\n", word);
        }
    }

    // Check palindrome using reverse method
    private static boolean isPalindromeReversed(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversedWord);
    }

    // Check palindrome using loop method
    private static boolean isPalindromeLoop(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
