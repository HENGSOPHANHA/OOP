import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class WordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the letter(s) to find in words: ");
        String lettersToFind = scanner.nextLine();

        // Split the text into words using regular expression
        String[] words = text.split("\\s+");

        // Create an ArrayList to store words containing specified letter(s)
        ArrayList<String> wordsWithLetter = new ArrayList<>();

        // Create a regular expression pattern for matching letters
        Pattern pattern = Pattern.compile(".*[" + lettersToFind + "].*");

        for (String word : words) {
            if (pattern.matcher(word).matches()) {
                wordsWithLetter.add(word);
            }
        }

        // Display the list of words and the count
        System.out.println("List of words containing letter(s) '" + lettersToFind + "':");
        for (String word : wordsWithLetter) {
            System.out.println("|" + word + "|");
        }

        System.out.println("There are " + wordsWithLetter.size() + " words containing letter(s) \"" + lettersToFind + "\"");

        scanner.close();
    }
}
