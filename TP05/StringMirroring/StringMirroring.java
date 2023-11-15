package StringMirroring;

import java.util.Scanner;

 public class StringMirroring {

    public static String makePalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word + reversedWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String inputWord = scanner.nextLine();

        String palindrome = makePalindrome(inputWord);
        System.out.println(palindrome);
    }
}
