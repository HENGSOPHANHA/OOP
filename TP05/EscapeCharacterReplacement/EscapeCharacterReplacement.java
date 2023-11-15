package EscapeCharacterReplacement;

import java.util.Scanner;

public class EscapeCharacterReplacement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence:");
        String sentence = scanner.nextLine();

        // Replace escape characters with their corresponding replacements
        sentence = sentence.replace("\\n", "(new_line)");
        sentence = sentence.replace("\\t", "(tab)");
        sentence = sentence.replace("\\\\", "(slash)");
        sentence = sentence.replace("//", "(comment_line)");
        sentence = sentence.replace(":)", "(smile)");

        // Print the replaced sentence
        System.out.println(sentence);
    }
}
